package template.app.services.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import template.app.business.TestB;
import template.app.dao.InstansiDao;
import template.app.entities.Instansi;
import template.app.services.TestService;

@Service("TestService")
public class TestServiceImpl implements TestService {
	@Inject
	private TestB testB;

	@Inject
	private InstansiDao instansiDao;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Instansi> getAllObj(int... idx) {
		return instansiDao.findAll(idx);
	}

	@Transactional(readOnly = false)
	public Instansi insertObj(Instansi instansi) {
		return instansiDao.insert(instansi);
	}

}
