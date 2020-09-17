package com.cetc.mapper;

import com.cetc.entity.PersonQuery;

import java.util.List;

public interface PersonMapper {
    List<PersonQuery> selectList();
}
