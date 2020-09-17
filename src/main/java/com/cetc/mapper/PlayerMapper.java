package com.cetc.mapper;

import com.cetc.entity.Player;

import java.util.List;

public interface PlayerMapper {
    List<Player> selectByName(String pname);
}
