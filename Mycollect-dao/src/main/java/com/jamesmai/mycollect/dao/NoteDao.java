package com.jamesmai.mycollect.dao;

import com.jamesmai.mycollect.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/3/17.
 */
public interface NoteDao extends JpaRepository<Note, Long>{
}
