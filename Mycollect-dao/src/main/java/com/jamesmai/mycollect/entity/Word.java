package com.jamesmai.mycollect.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/17.
 */
@Entity
@Table(name="word")
public class Word {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name="word")
    private String word;

    //翻译
    @Column(name="translate")
    private String translate;

    //音标
    @Column(name="phonogram")
    private String phonogram;

    //翻译详情
    @Column(name="translate_detail")
    private String translateetail;

    //是否翻译后的声音发音
    @Column(name="has_translate_sound")
    private boolean hasTranslateSound;

    //第一个搜索的用户ID
    @Column(name="first_search_user_id")
    private Long firstSearchUserId;

    @Column(name="create_time")
    private Date createTime;

    @Column(name="modify_time")
    private Date modifyTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getPhonogram() {
        return phonogram;
    }

    public void setPhonogram(String phonogram) {
        this.phonogram = phonogram;
    }

    public String getTranslateetail() {
        return translateetail;
    }

    public void setTranslateetail(String translateetail) {
        this.translateetail = translateetail;
    }

    public boolean isHasTranslateSound() {
        return hasTranslateSound;
    }

    public void setHasTranslateSound(boolean hasTranslateSound) {
        this.hasTranslateSound = hasTranslateSound;
    }

    public Long getFirstSearchUserId() {
        return firstSearchUserId;
    }

    public void setFirstSearchUserId(Long firstSearchUserId) {
        this.firstSearchUserId = firstSearchUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
