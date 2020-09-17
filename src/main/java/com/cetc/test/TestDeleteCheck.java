package com.cetc.test;

import com.cetc.entity.Users;
import com.cetc.mapper.UsersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class TestDeleteCheck {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        Reader reader= Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory factory=builder.build(reader);
        SqlSession session=factory.openSession();
        UsersMapper mapper=session.getMapper(UsersMapper.class);
        //Users users=new Users();
       /* List<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(10);
        list.add(11);*/
        //users.setIds(list);
        //mapper.deleteCheck(list);
        Integer[] ids=new Integer[]{8,10,11};
        mapper.deleteCheckArray(ids);
       // session.commit();
    }
}
