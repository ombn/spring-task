package com.xworkz.press.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.xworkz.press.dto.PressOrderDTO;

@Component
public class PressOrderDAOImpl implements PressOrderDAO {

	private SessionFactory factory;

	public void save(PressOrderDTO dto) {

		Session session1 = null;
		try (Session session = this.factory.openSession()) {
			session1 = session;
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();

		} catch (HibernateException exception) {
			exception.printStackTrace();
			session1.getTransaction().rollback();
		}

	}

	public PressOrderDTO fetchByOrderFrom(String name) {

		try (Session session = this.factory.openSession()) {
			Query<PressOrderDTO> query = session.createNamedQuery("fetchByOrderFrom");
			query.setParameter("from", name);
			return query.uniqueResult();
		}
	}

}
