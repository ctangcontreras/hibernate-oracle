package com.mkyong.common;

import java.util.Objects;

import org.hibernate.Session;

import com.mkyong.util.HibernateUtil;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Session session = HibernateUtil.getSessionFactory().openSession();
        
        if (Objects.nonNull(session)){
        	System.out.println("Conexion Exitosa");
        } else {
        	System.out.println("Conexion Fallida");
        }
 	
       
       
	}	
}
