package com.TKA.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TKA.entity.WcWorldcup;

@Repository
public class WcwoldcupDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<WcWorldcup> allIndianCricketStaffList()
	{
		Session session = factory.openSession();
		Criteria c = session.createCriteria(WcWorldcup.class);
		List <WcWorldcup> cricketSatfflist = c.list();
		System.out.println(cricketSatfflist);
		return cricketSatfflist;
		
		
	}

	public void insertCricketStaff(WcWorldcup w) {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(w);
		tx.commit();
		
	}

	public void updateCricketStaff(WcWorldcup w) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(w);
		tx.commit();
		
	}

	public void deleteCricketStaff(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		WcWorldcup obj = session.load(WcWorldcup.class, id);
		session.delete(obj);
		tx.commit();
		
	}

}
