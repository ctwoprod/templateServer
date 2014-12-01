/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.bkn.template.dao.impl;

import id.go.bkn.template.dao.LoginDAO;
import id.go.bkn.template.entities.Login;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author ditlahta-03
 */
@Repository("LoginDAO")
public class LoginDAOImpl implements LoginDAO {
	private static final Logger logger = LoggerFactory
			.getLogger(LoginDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addLogin(Login l) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(l);
		logger.info("User sudah ditambahkan");
	}

	@Override
	public void updtLogin(Login l) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(l);
		logger.info("User " + l + "sudah terupdate");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Login> listLogin() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Login> listLogin = session.createQuery("from Login").list();
		for (Login l : listLogin) {
			logger.info("User : " + l);
		}
		return listLogin;
	}

	@Override
	public Login getLoginByUser(String user) {
		Session session = this.sessionFactory.getCurrentSession();
		Login l = (Login) session.load(Login.class, new String(user));
		// logger.info("Instansi loaded successfully, Instansi detail="+i);
		return l;
	}

	@Override
	public void removeLogin(String id) {
		Session session = this.sessionFactory.getCurrentSession();
		Login l = (Login) session.load(Login.class, new String(id));
		if (null != l) {
			session.delete(l);
		}
		logger.info("User sudah terhapus");
	}

	@Override
	public Login findLoginByUser(String user, String password) {
		Session session = this.sessionFactory.getCurrentSession();
		Login login = new Login();
		String sqlQuery = "select login from Login login where login.user= :user and login.password = :password";
		Query query = session.createQuery(sqlQuery);
		query.setParameter("user", user);
		query.setParameter("password", password);
		login = (Login) query.uniqueResult();
		return login;
	}

	@Override
	public Login findLoginByNip(String nip) {
		Session session = this.sessionFactory.getCurrentSession();
		Login l = (Login) session.load(Login.class, new String(nip));
		return l;
	}

	@Override
	public Boolean findLoginByInstansi(String instansi) {
		Session session = this.sessionFactory.getCurrentSession();
		Boolean l = (Boolean) session.load(Login.class, new String(instansi));
		return l;
	}

}
