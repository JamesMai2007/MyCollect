package com.jamesmai.mycollect.constant;

/**
 * Created by Administrator on 2018/3/17.
 */
public enum FolderType {
    LINK("链接"),NOTE("笔记"),WORD("单词");
    String name;
    FolderType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
