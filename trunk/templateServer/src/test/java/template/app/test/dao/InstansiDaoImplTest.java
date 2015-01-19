package template.app.test.dao;

import static org.junit.Assert.assertNotNull;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import template.app.dao.InstansiDao;
import template.app.entities.Instansi;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app-config.xml")
@Transactional
public class InstansiDaoImplTest {

	@Autowired
	private InstansiDao instansiDao;

	@Test
	public void testGetInstansiById() {
		Instansi instansi = instansiDao
				.findById("A8ACA743AE923912E040640A040269BB");
		assertNotNull(instansi);
	}

	@Test
	public void testUpdateInstansi() {
		Instansi instansi = instansiDao
				.findById("A8ACA743AE923912E040640A040269BB");
		instansi.setNama("pangaribuan");
		instansiDao.update(instansi);
		Assert.assertEquals("pangaribuan", instansi.getNama());
	}

}
