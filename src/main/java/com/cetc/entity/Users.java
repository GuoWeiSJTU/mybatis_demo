package com.cetc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Users {
    private int id;
    private String name;
    private String pwd;
    private String lasttime;
    private List<Integer> ids;
}
