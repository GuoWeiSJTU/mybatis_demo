package com.cetc.entity;

import lombok.Data;

@Data
public class DriverQuery extends DriverInfo{
    private Person person;
    public String toString(){
        return "["+person.getPid()+","+person.getPname()+
                ","+person.getAge()+","+this.getDid()+","+this.getDtype()+"]";
    }
}
