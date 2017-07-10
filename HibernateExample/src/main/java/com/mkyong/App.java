package com.mkyong;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.mkyong.user.DBUser;
import com.mkyong.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		// INSERTAR
//		 session.beginTransaction();
//		 DBUser user = new DBUser();
//		
//		 user.setUserId(101);
//		 user.setUsername("superman2");
//		 user.setCreatedBy("carlos");
//		 user.setCreatedDate(new Date());
//		
//		 session.save(user);
//		 session.getTransaction().commit();
 		// EDITAR
//		session.beginTransaction();
//		 DBUser user = new DBUser();
//		
//		 user.setUserId(101);
//		 user.setUsername("superman22");
//		 user.setCreatedBy("samir");
//		 user.setCreatedDate(new Date());
//		session.update(user);
//
//		session.getTransaction().commit();
		
		
		//Listar por id
//		DBUser profesor=(DBUser)session.get(DBUser.class,101);
//		System.out.println("> "+profesor);
		
		//Eliminar
//		session.beginTransaction();
//		 
//		session.delete(profesor);
//		 
//		session.getTransaction().commit();
		
		//listar
         session.beginTransaction();
        List<DBUser> result = (List<DBUser>)session.createQuery("from DBUser").list();
        session.getTransaction().commit();
        for (DBUser evento : result) {
        	System.out.println("<"+evento);
        }
        session.close();
	}
}
