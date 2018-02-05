package com.com.armen.th.db.pojo;

import java.util.ArrayList;

/**
 * Created by Armen on 2/3/2018.
 */

public class Word {
    private String code;
    private String name;

    public Word(ArrayList<String> word) {
        this.word = word;
    }

    public ArrayList<String> getWord() {
        return word;
    }

    public void setWord(ArrayList<String> word) {
        this.word = word;
    }

    private ArrayList<String> word;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

