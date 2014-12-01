package id.go.bkn.template.entities;

// Generated 06 Nov 14 10:38:19 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PnsKriteriaAudit generated by hbm2java
 */
@Entity
@Table(name = "pns_kriteria_audit", catalog = "simwasdal")
public class PnsKriteriaAudit implements java.io.Serializable {

	private String id;
	private Login login;
	private PnsElemenAudit pnsElemenAudit;
	private String nama;
	private String regulasi;
	private Date createDate;
	private String status;
	private String tahunAwalBerlaku;
	private String tahunAkhirBerlaku;
	private short skorMaks;
	private String noUrut;
	private String jawabSatu;
	private String jawabDua;
	private String isi;
	private String keterangan;
	private String selectted40;

	private Set<PnsTransaksiJawaban> pnsTransaksiJawabans = new HashSet<PnsTransaksiJawaban>(
			0);

	public PnsKriteriaAudit() {
	}

	public PnsKriteriaAudit(String id, Login login,
			PnsElemenAudit pnsElemenAudit, String nama, String regulasi,
			Date createDate, String status, String tahunAwalBerlaku,
			String tahunAkhirBerlaku, short skorMaks, String noUrut) {
		this.id = id;
		this.login = login;
		this.pnsElemenAudit = pnsElemenAudit;
		this.nama = nama;
		this.regulasi = regulasi;
		this.createDate = createDate;
		this.status = status;
		this.tahunAwalBerlaku = tahunAwalBerlaku;
		this.tahunAkhirBerlaku = tahunAkhirBerlaku;
		this.skorMaks = skorMaks;
		this.noUrut = noUrut;
	}

	public PnsKriteriaAudit(String id, Login login,
			PnsElemenAudit pnsElemenAudit, String nama, String regulasi,
			Date createDate, String status, String tahunAwalBerlaku,
			String tahunAkhirBerlaku, short skorMaks, String noUrut,
			String jawabSatu, String jawabDua,
			Set<PnsTransaksiJawaban> pnsTransaksiJawabans) {
		this.id = id;
		this.login = login;
		this.pnsElemenAudit = pnsElemenAudit;
		this.nama = nama;
		this.regulasi = regulasi;
		this.createDate = createDate;
		this.status = status;
		this.tahunAwalBerlaku = tahunAwalBerlaku;
		this.tahunAkhirBerlaku = tahunAkhirBerlaku;
		this.skorMaks = skorMaks;
		this.noUrut = noUrut;
		this.jawabSatu = jawabSatu;
		this.jawabDua = jawabDua;
		this.pnsTransaksiJawabans = pnsTransaksiJawabans;
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
	@JoinColumn(name = "LOGIN_ID_CREATE", nullable = false)
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PNS_ELEMEN_AUDIT_ID", nullable = false)
	public PnsElemenAudit getPnsElemenAudit() {
		return this.pnsElemenAudit;
	}

	public void setPnsElemenAudit(PnsElemenAudit pnsElemenAudit) {
		this.pnsElemenAudit = pnsElemenAudit;
	}

	@Column(name = "NAMA", nullable = false, length = 150)
	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Column(name = "REGULASI", nullable = true, length = 65535)
	public String getRegulasi() {
		return this.regulasi;
	}

	public void setRegulasi(String regulasi) {
		this.regulasi = regulasi;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "TAHUN_AWAL_BERLAKU", nullable = false, length = 4)
	public String getTahunAwalBerlaku() {
		return this.tahunAwalBerlaku;
	}

	public void setTahunAwalBerlaku(String tahunAwalBerlaku) {
		this.tahunAwalBerlaku = tahunAwalBerlaku;
	}

	@Column(name = "TAHUN_AKHIR_BERLAKU", nullable = false, length = 4)
	public String getTahunAkhirBerlaku() {
		return this.tahunAkhirBerlaku;
	}

	public void setTahunAkhirBerlaku(String tahunAkhirBerlaku) {
		this.tahunAkhirBerlaku = tahunAkhirBerlaku;
	}

	@Column(name = "SKOR_MAKS", nullable = false)
	public short getSkorMaks() {
		return this.skorMaks;
	}

	public void setSkorMaks(short skorMaks) {
		this.skorMaks = skorMaks;
	}

	@Column(name = "NO_URUT", nullable = false, length = 2)
	public String getNoUrut() {
		return this.noUrut;
	}

	public void setNoUrut(String noUrut) {
		this.noUrut = noUrut;
	}

	@Column(name = "JAWAB_SATU", length = 200)
	public String getJawabSatu() {
		return this.jawabSatu;
	}

	public void setJawabSatu(String jawabSatu) {
		this.jawabSatu = jawabSatu;
	}

	@Column(name = "JAWAB_DUA", length = 200)
	public String getJawabDua() {
		return this.jawabDua;
	}

	public void setJawabDua(String jawabDua) {
		this.jawabDua = jawabDua;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnsKriteriaAudit")
	public Set<PnsTransaksiJawaban> getPnsTransaksiJawabans() {
		return this.pnsTransaksiJawabans;
	}

	public void setPnsTransaksiJawabans(
			Set<PnsTransaksiJawaban> pnsTransaksiJawabans) {
		this.pnsTransaksiJawabans = pnsTransaksiJawabans;
	}
	
	 public String getIsi()
	    {
	        return isi;
	    }
	    
	    public void setIsi(String isi)
	    {
	        this.isi = isi;
	    }
	    public String getKeterangan()
	    {
	        return keterangan;
	    }
	    
	    public void setKeterangan(String keterangan)
	    {
	        this.keterangan = keterangan;
	    }
	    public String getSelected40()
	    {
	        return selectted40;
	    }
	    
	    public void setSelected40(String selectted40)
	    {
	        this.selectted40 = selectted40;
	    }

}
