package com.game.bookandplay.service.entities;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestClient {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		TypedQuery query = session.createQuery("from BStatus");
		List<BStatus> list = query.getResultList();
		Iterator<BStatus> itr = list.iterator();
		while (itr.hasNext()) {
			BStatus bs = itr.next();
			System.out.println(">>>> :" + bs.getStatusCd());
		}
		session.close();
		System.out.println("success");
	}

}
