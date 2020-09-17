package com.cetc.test;

import com.cetc.entity.Player;
import com.cetc.entity.Team;
import com.cetc.mapper.PlayerMapper;
import com.cetc.mapper.TeamMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestOneToMany {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        Reader reader= Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory factory=builder.build(reader);
        SqlSession session=factory.openSession();
        PlayerMapper mapper=session.getMapper(PlayerMapper.class);
        List<Player> list=mapper.selectByName("李");
        for (Player p:list){
            System.out.println(p);
        }
        session.close();

       /* TeamMapper mapper=session.getMapper(TeamMapper.class);
        List<Team> list=mapper.selectList();
        for (Team team:list){
            System.out.println(team.getTid()+"\t"+team.getTname());
            List<Player> pList=team.getPlayers();
            for (Player player:pList){
                System.out.println("\t\t"+player);
            }
        }*/
        session.close();
    }
}
