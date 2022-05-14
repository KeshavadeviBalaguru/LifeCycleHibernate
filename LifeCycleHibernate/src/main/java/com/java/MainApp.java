package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class MainApp {

	public static void main(String[] args) {
	MyLaptop lop=new MyLaptop();
	lop.setLid(2);
	lop.setLname("HP");
	lop.setLprice(45000);//transient state

    Configuration conn=new Configuration().configure().addAnnotatedClass(MyLaptop.class);	
    ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
    SessionFactory sf=conn.buildSessionFactory(reg);
    Session sess=sf.openSession();
   Transaction tx=sess.beginTransaction();
	
	/*sess.save(lop);//peristent state
	lop.setLprice(40000);
	tx.commit();
	*/
   
   //detach state
   sess.save(lop);
   tx.commit();
   sess.evict(lop);
   lop.setLprice(38000);
  
   
   //delete state
   /*sess.save(lop);
   sess.delete(lop);
   tx.commit();
*/
	}

}
