package com.cetc.entity;

import lombok.Data;

@Data
public class Player {
    private int pid;
    private String pname;
    private int age;
    private int tid;
    private Team team;
}
