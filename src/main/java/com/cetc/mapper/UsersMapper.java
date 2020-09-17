package com.cetc.mapper;

import com.cetc.entity.Page;
import com.cetc.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {
    void insert(Users users);
    void delete(int id);
    void update(Users users);
    Users selectById(int id);
    List<Users> selectList();
    List<Users> selectByExample(Users users);
    void deleteCheck(List<Integer> ids);
    void deleteCheckObj(Users users);
    void deleteCheckArray(Integer[] ids);
    List<Users> selectByPage(Page page);
    List<Users> selectByPageMulArg(@Param("start") int start,@Param("size") int size);

}
