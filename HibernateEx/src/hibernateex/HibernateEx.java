/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateex;
import models.College;
import models.University;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Sushant Sinha
 */
public class HibernateEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here



        College clg = new College();
        clg.setName("Shri Ramdeobaba College of Engineering");
        clg.setStudent_count(3200);
        clg.setAddress("Gittikhadan Nagpur");
        
        College clg2 = new College();
        clg2.setName("YCCE");
        clg2.setStudent_count(4000);
        clg2.setAddress("Hingna Nagpur");
        
        University univ = new University();
        univ.setName("RTMNU");
        univ.setCity("Nagpur");
        univ.setState("Maharashtra");
        univ.getColleges().add(clg);
        univ.getColleges().add(clg2);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(clg);
        session.save(clg2);
        session.save(univ);
        session.getTransaction().commit();
    }
    
}
