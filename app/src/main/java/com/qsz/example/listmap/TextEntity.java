package com.qsz.example.listmap;

/**
 * Created by shixin on 2018/4/24.
 */

public class TextEntity extends BaseEntity {
    public String text;

    public TextEntity(String text) {
        super(Consts.VIEWTYPE_TEXT);
        this.text = text;
    }

}