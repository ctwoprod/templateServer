/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.bkn.template.dao;

/**
 *
 * @author ditlahta-03
 */

import id.go.bkn.template.entities.Login;

import java.util.List;

public interface LoginDAO {
	public void addLogin(Login l);

	public void updtLogin(Login l);

	public List<Login> listLogin();

	public Login getLoginByUser(String user);

	public void removeLogin(String id);

	public Login findLoginByUser(String user, String password);

	public Login findLoginByNip(String nip);

	public Boolean findLoginByInstansi(String instansi);
}
