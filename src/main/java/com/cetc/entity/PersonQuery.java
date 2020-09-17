package com.cetc.entity;

import lombok.Data;

@Data
public class PersonQuery extends Person {
    private int did;
    private String dtype;
    public String toString(){
        return "["+getPid()+"\t"+getPname()+"\t"+getAge()+"\t"+did+"\t"+dtype+"]";
    }
}
