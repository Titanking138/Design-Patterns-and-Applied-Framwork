/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpaf_lab10;

/**
 *
 * @author IT069 arjun
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {

    public static void main(String[] args) {

        Answer answer1 = new Answer(25, "Java is Programming Language");
        Question q1 = new Question(1, "What is Java?", answer1);
        Answer answer2 = new Answer(27, "API work with object in java");
        Question q2 = new Question(2, "What is Collection Framework?", answer2);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(q1);
        session.save(q2);
        session.save(answer1);
        session.save(answer2);
        tx.commit();
        session.close();
        sessionFactory.close();
    }

}
