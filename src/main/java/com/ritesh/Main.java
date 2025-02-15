package com.ritesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setId(1001);
        s1.setName("Ritesh");
        s1.setTech("Java");


        Configuration config = new Configuration();
        config.addAnnotatedClass(com.ritesh.Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(s1);
        transaction.commit();

    }
}
