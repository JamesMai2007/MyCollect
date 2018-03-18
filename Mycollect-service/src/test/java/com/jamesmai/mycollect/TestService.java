package com.jamesmai.mycollect;

import com.jamesmai.mycollect.constant.FolderType;
import com.jamesmai.mycollect.entity.Folder;
import com.jamesmai.mycollect.entity.User;
import com.jamesmai.mycollect.entity.Word;
import com.jamesmai.mycollect.service.FolderService;
import com.jamesmai.mycollect.service.UserService;
import com.jamesmai.mycollect.service.WordService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {
    @Autowired
    private UserService userService;
    @Autowired
    private FolderService folderService;
    @Autowired
    private WordService wordService;
    @Test
    public void test(){
        User user = new User();
        user.setAccount("root");
        user.setCreateTime(new Date());
        user.setEmail("email");
        user.setNickName("JamesMai");
        user.setPhone("phone");
        userService.save(user);

        Folder folder = new Folder();
        folder.setCreateTime(new Date());
        folder.setModifyTime(null);
        folder.setTitle("Spring");
        folder.setType(FolderType.LINK);
        folder.setUserId(user.getId());
        folderService.save(folder);

        Assert.assertNotNull(folderService.list());

        Word word = new Word();
        wordService.addWrod(user.getId() , folder.getId() , word);

        System.out.println(user.getId()+"  "+folder.getId());

        wordService.listWord(1L , 1L).forEach(item ->{
            System.out.println(item.getWord());
        });

        /*folderService.list().forEach(item->{
            System.out.println(item.getTitle());
            System.out.println(item.getType().getName());
        });*/


    }

}
