package com.jamesmai.mycollect.dao;

import com.jamesmai.mycollect.entity.UserWord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/17.
 */
public interface UserWordDao extends JpaRepository<UserWord, Long>{
    public List<UserWord> findByUserIdAndFolderId(Long userId , Long folderId);
}
