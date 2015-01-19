package template.app.entities;

// Generated 06 Nov 14 10:38:19 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import template.app.core.persistence.domain.CoreDomain;

/**
 * Login generated by hbm2java
 */
@Entity
@Table(name = "login", catalog = "simwasdal")
public class Login extends CoreDomain {

	private String id;
	private Instansi instansi;
	private String user;
	private String password;
	private String nipBaru;
	private String nama;
	private String profil;

	public Login() {
	}

	public Login(String id, Instansi instansi, String user, String password,
			String nipBaru, String nama) {
		this.id = id;
		this.instansi = instansi;
		this.user = user;
		this.password = password;
		this.nipBaru = nipBaru;
		this.nama = nama;
	}

	public Login(String id, Instansi instansi, String user, String password,
			String nipBaru, String nama, String profil) {
		this.id = id;
		this.instansi = instansi;
		this.user = user;
		this.password = password;
		this.nipBaru = nipBaru;
		this.nama = nama;
		this.profil = profil;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INSTANSI_ID", nullable = false)
	public Instansi getInstansi() {
		return this.instansi;
	}

	public void setInstansi(Instansi instansi) {
		this.instansi = instansi;
	}

	@Column(name = "USER", nullable = false, length = 100)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "PASSWORD", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "NIP_BARU", nullable = false, length = 18)
	public String getNipBaru() {
		return this.nipBaru;
	}

	public void setNipBaru(String nipBaru) {
		this.nipBaru = nipBaru;
	}

	@Column(name = "NAMA", nullable = false, length = 150)
	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Column(name = "PROFIL", length = 1)
	public String getProfil() {
		return this.profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

}
