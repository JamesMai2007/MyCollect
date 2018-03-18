package com.jamesmai.mycollect.service;

import com.jamesmai.mycollect.dao.FolderDao;
import com.jamesmai.mycollect.entity.Folder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/17.
 */
@Service
public class FolderService {
    @Autowired
    private FolderDao folderDao;

    public List<Folder> list(){
        return folderDao.findAll();
    }

    public void save(Folder folder){
        folderDao.save(folder);
    }
}
