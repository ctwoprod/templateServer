/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template.app.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import template.app.core.persistence.dao.impl.CoreDaoImpl;
import template.app.dao.LoginDao;
import template.app.entities.Login;

/**
 * 
 * @author ditlahta-03
 */
@Repository("LoginDao")
public class LoginDaoImpl extends CoreDaoImpl<Login> implements LoginDao {
	@Autowired
	public LoginDaoImpl(SessionFactory sessionFactory) {
		super(template.app.entities.Login.class, sessionFactory);
	}

	public Login findLoginByUser(String user, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public Login findLoginByNip(String nip) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean findLoginByInstansi(String instansi) {
		// TODO Auto-generated method stub
		return null;
	}
}
