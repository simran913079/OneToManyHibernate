package comp.Anudip;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Course c=new Course();
    	c.setCid(101);
    	c.setCoursename("Java");
    	Course c1=new Course();
    	c1.setCid(102);
    	c1.setCoursename("Python");
    	
    	Teacher t=new Teacher();
    	t.setId(101);
    	t.setName("Mrunali");
    	t.getList1().add(c);
    	t.getList1().add(c1);
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class).addAnnotatedClass(Course.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tr=s.beginTransaction();
    	s.save(c);
    	s.save(c1);
    	s.save(t);
    	s.getTransaction().commit();
        System.out.println( "Hello World!" );
    }
}
