package com.jamesmai.mycollect.service;

import com.jamesmai.mycollect.dao.UserDao;
import com.jamesmai.mycollect.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/17.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> list(){
        return userDao.findAll();
    }

    public void save(User user){
        userDao.save(user);
    }
}
