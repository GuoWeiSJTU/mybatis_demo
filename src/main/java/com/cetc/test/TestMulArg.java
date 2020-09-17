package com.cetc.test;

import com.cetc.entity.Page;
import com.cetc.entity.Users;
import com.cetc.mapper.UsersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestMulArg {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        Reader reader= Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory factory=builder.build(reader);
        SqlSession session=factory.openSession();
        UsersMapper mapper=session.getMapper(UsersMapper.class);
        mapper.delete(10);
       // List<Users> list=mapper.selectByPageMulArg(0,5);//mapper.selectByPage(new Page(0,5));
       // for (Users user:list)
       //     System.out.println(user);
    }
}
