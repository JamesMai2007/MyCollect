package com.jamesmai.mycollect.service;

import com.jamesmai.mycollect.dao.UserWordDao;
import com.jamesmai.mycollect.dao.WordDao;
import com.jamesmai.mycollect.entity.UserWord;
import com.jamesmai.mycollect.entity.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/3/17.
 */
@Service
public class WordService {
    @Autowired
    private UserWordDao userWordDao;
    @Autowired
    private WordDao wordDao;

    @Transactional(readOnly = true)
    public List<Word> listWord(Long userId , Long folderId)
    {
        List<UserWord> uwlist = userWordDao.findByUserIdAndFolderId(userId , folderId);
        List<String> ids = uwlist.stream().map(item->{return item.getWordId();}).collect(Collectors.toList());
        System.out.println(ids.size());
        return wordDao.findAllById(ids);
    }

    @Transactional
    public void addWrod(Long userId , Long folderId , Word word){

        word.setPhonogram("[]");
        word.setTranslate("apple");
        word.setWord("苹果");
        word.setTranslateetail("[]苹果详情");

        try {
            word.setId(DigestUtils.md5DigestAsHex(word.getWord().getBytes("utf-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        word.setFirstSearchUserId(userId);
        word.setHasTranslateSound(false);

        word.setCreateTime(new Date());

        wordDao.save(word);


        UserWord uw = new UserWord();
        uw.setCreateTime(new Date());
        uw.setModifyTime(null);
        uw.setFolderId(folderId);
        uw.setOrderNo(0);
        uw.setUserId(userId);
        uw.setWordId(word.getId());

        userWordDao.save(uw);

    }

}
