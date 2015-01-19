package template.app.services;

import java.util.List;

import template.app.entities.Instansi;

public interface TestService {
	List<Instansi> getAllObj(int... idx);

	Instansi insertObj(Instansi instansi);
}
