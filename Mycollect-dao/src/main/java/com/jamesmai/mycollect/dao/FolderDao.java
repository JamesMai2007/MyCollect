package com.jamesmai.mycollect.dao;

import com.jamesmai.mycollect.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/3/17.
 */
public interface FolderDao extends JpaRepository<Folder, Long>{
}
