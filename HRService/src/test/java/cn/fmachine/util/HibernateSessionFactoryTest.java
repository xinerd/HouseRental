package cn.fmachine.util;

import cn.fmachine.entity.HouseUser;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

public class HibernateSessionFactoryTest {

    /*@Test
    public void sessionTest() {
        Session session = HibernateSessionFactory.getSession();
        Query q = session.createQuery("From HouseUser");
        List<HouseUser> list = q.list();
        for (HouseUser user : list) {
            System.out.println(user.getRealname());
        }

    }*/

}