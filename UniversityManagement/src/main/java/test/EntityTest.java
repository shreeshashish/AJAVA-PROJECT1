package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import util.HibernateUtil;
import model.Student;

public class EntityTest {
    public static void main(String[] args) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();


            String hql = "from Student";
            System.out.println("Testing HQL query: " + hql);

            Query<Student> query = session.createQuery(hql, Student.class);
            System.out.println("Query created successfully!");


            java.util.List<Student> students = query.list();
            System.out.println("Query executed successfully! Found " + students.size() + " students");

            session.close();
            System.out.println("Entity test completed successfully!");

        } catch (Exception e) {
            System.out.println("Entity test failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}