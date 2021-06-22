package com.test;

import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String argv[]){
        //创建configuration对象
        Configuration configuration=new Configuration().configure();
        System.out.println(configuration);
        //获取sessionFactory
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        //获取session
        Session session= sessionFactory.openSession();

        //开是事务
        session.beginTransaction();
        User user=new User();
        user.setUsername("hdx");
        user.setPassword("hdx");
        session.save(user);
        //提交事务
        session.getTransaction().commit();
        session.close();
    }
}
