package id.go.bkn.template.servlet;

import id.go.bkn.template.dao.LoginDAO;
import id.go.bkn.template.entities.Login;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Servlet implementation class ReportServlet
 */
@Component("ReportServlet")
public class ReportServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private LoginDAO loginDAO;

	/** The application context. */
	private ApplicationContext applicationContext;

	public void setApplicationContext(
			ApplicationContext currentApplicationContext) {
		applicationContext = currentApplicationContext;
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	@Override
	public void init() throws ServletException {
		setApplicationContext(WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext()));
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReportServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("getete");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String baseDir = getBaseDirectory(request);
		String fileName = baseDir + "/reports/reportTestSimple.jasper";
		// TODO Auto-generated method stub
		Map<String, Object> myMap = new HashMap<String, Object>();
		List<Map<String, Object>> listResult = new ArrayList<Map<String, Object>>();

		
		List<Login> listPns = new ArrayList<Login>();
		//tambahkan FIELD / data di sini
		for (Login pns : listPns) {
			Map<String, Object> test = new HashMap<String, Object>();
			test.put("id", pns.getId());
			test.put("nama", pns.getNama());
			test.put("nipBaru", pns.getNipBaru());
			// listResult.add(pns);
			listResult.add(test);
		}

		myMap.put("parameter1", "ini param test saja");

		try {
			byte[] bytes = null;
			net.sf.jasperreports.engine.data.JRBeanArrayDataSource myJrDataSource = new JRBeanArrayDataSource(
					listResult.toArray());
			bytes = JasperRunManager.runReportToPdf(fileName, myMap,
					myJrDataSource);
			serveReport(request, response, bytes);
		} catch (Exception e) {
			throw new ServletException("Failed to Generate General PDF Report",
					e);
		}
	}

	private void serveReport(HttpServletRequest request,
			HttpServletResponse response, byte[] bytes) throws IOException {
		InputStream inputStream = new ByteArrayInputStream(bytes);
		OutputStream outputStream = response.getOutputStream();

		// send the pdf document to the client directly
		response.setContentType("application/pdf");
		response.setContentLength(bytes.length);
		outputStream.write(bytes, 0, bytes.length);
		outputStream.flush();
		outputStream.close();

	}

	private String getBaseDirectory(HttpServletRequest request) {
		return request.getSession().getServletContext()
				.getRealPath("/WEB-INF/");
	}

}
