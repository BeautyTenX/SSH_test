package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf;
	static{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
	}
}
