/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template.app.dao;

/**
 *
 * @author ditlahta-03
 */

import template.app.core.persistence.dao.CoreDao;
import template.app.entities.Login;

public interface LoginDao extends CoreDao<Login> {
	public Login findLoginByUser(String user, String password);

	public Login findLoginByNip(String nip);

	public Boolean findLoginByInstansi(String instansi);
}
