package com.cetc.test;

import com.cetc.entity.Users;
import com.cetc.mapper.UsersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Test {
    private static Logger logger=Logger.getLogger(Test.class);
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        Reader reader= Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory factory=builder.build(reader);
        SqlSession session=factory.openSession();
        UsersMapper mapper=session.getMapper(UsersMapper.class);
        Users users=new Users();
        users.setName("q");
        users.setLasttime("2020-07");
        //users.setPwd("111");

        List<Users> list=mapper.selectByExample(users);//mapper.selectList();
        for (Users user:list)
            System.out.println(user);
        session.close();
       /* try{}catch() {
            logger.error("xxxxxxxxxxxx");
        }*/
    }
}
