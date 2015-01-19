package template.app.report.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import template.app.core.report.GeneralReportUtil;
import template.app.dao.LoginDao;
import template.app.entities.Login;

@Component("ReportTestCommand")
public class ReportTestCommand extends ReportCommand {

	/**
	 * serialVersionUID
	 */
	@Inject
	private LoginDao loginDao;

	private static final long serialVersionUID = -599742719308669945L;

	@Override
	protected byte[] generateXls(Object[] pMyData, Map<String, Object> myMap)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		String baseDir = getBaseDirectory(request);
		String fileName = baseDir + GeneralReportUtil.getRptTest();
		// TODO Auto-generated method stub
		Map<String, Object> myMap = new HashMap<String, Object>();
		List<Map<String, Object>> listResult = new ArrayList<Map<String, Object>>();

		List<Login> listLogin = loginDao.findAll(new int[] { 1, 5 });
		for (Login login : listLogin) {
			Map<String, Object> test = new HashMap<String, Object>();
			test.put("pnsId", login.getId());
			test.put("pnsNama", login.getNama());
			listResult.add(test);
		}

		myMap.put("TEST_SAJA", "ini param test saja");
		this.generalPDFReports(listResult.toArray(), request, response, myMap,
				fileName);
	}

}
