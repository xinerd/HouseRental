package cn.fmachine.web.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.fmachine.entity.HouseUser;
import cn.fmachine.util.HibernateSessionFactory;

public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSession();
        Query q = session.createQuery("From HouseUser");
        List<HouseUser> list = q.list();
        for (HouseUser user : list) {

            System.out.println(user.getRealname());
        }

    }

}
