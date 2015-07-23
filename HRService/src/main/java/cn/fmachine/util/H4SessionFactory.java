package cn.fmachine.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * H4SessionFactory
 * COPYRIGHT ©2014-2024, FMACHINE.CN, ALL RIGHTS RESERVED
 *
 * @author XIN MING
 * @since 7/23/15
 */
public class H4SessionFactory {

    private static SessionFactory factory;

    static {
        Configuration cfg = new Configuration().configure();
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
                cfg.getProperties()).buildServiceRegistry();
        factory = cfg.buildSessionFactory(sr);
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }

    public static Session getSession() {
        return factory.openSession();
    }

    public static void closeSession(Session session) {
        if (session != null) {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

}

