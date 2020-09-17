package com.cetc.entity;

import lombok.Data;

import java.util.List;

@Data
public class Team {
    private int tid;
    private String tname;
    private List<Player> players;
}
