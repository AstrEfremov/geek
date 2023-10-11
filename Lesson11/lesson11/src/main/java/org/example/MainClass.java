package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {
    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Buyer.class)
            .addAnnotatedClass(Item.class)
            .buildSessionFactory();

    Session session = null;
}
