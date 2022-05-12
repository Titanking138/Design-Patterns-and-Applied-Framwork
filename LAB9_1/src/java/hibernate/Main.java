package hibernate;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IT069 arjun
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        Student st = new Student("arjun", "maniya", 6);
        SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
