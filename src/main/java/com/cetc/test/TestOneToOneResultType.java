package com.cetc.test;

import com.cetc.entity.DriverQuery;
import com.cetc.entity.Person;
import com.cetc.entity.PersonQuery;
import com.cetc.mapper.DriverMapper;
import com.cetc.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.Driver;
import java.util.List;

public class TestOneToOneResultType {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        Reader reader= Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory factory=builder.build(reader);
        SqlSession session=factory.openSession();
        /*PersonMapper mapper=session.getMapper(PersonMapper.class);
        List<PersonQuery> list=mapper.selectList();
        for (PersonQuery query:list)
            System.out.println(query);*/
        DriverMapper mapper=session.getMapper(DriverMapper.class);
        List<DriverQuery> list=mapper.selectList();
        for (DriverQuery query:list)
            System.out.println(query);
        session.close();
    }
}
