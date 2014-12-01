package id.go.bkn.template.service.impl;

import id.go.bkn.template.dao.LoginDAO;
import id.go.bkn.template.service.InstansiService;

import javax.inject.Inject;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

@Service("InstansiService")
@RemotingDestination("InstansiService")
public class InstansiServiceImpl implements InstansiService {
	@Inject
	private LoginDAO loginDAO;
}
