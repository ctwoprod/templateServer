/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template.app.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import template.app.core.persistence.dao.impl.CoreDaoImpl;
import template.app.dao.InstansiDao;
import template.app.entities.Instansi;

/**
 * 
 * @author ditlahta-03
 */
@Repository("InstansiDao")
public class InstansiDaoImpl extends CoreDaoImpl<Instansi> implements
		InstansiDao {
	@Autowired
	public InstansiDaoImpl(SessionFactory sessionFactory) {
		super(template.app.entities.Instansi.class, sessionFactory);
	}
}
