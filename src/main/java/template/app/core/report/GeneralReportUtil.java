package template.app.core.report;

public class GeneralReportUtil {
	public static final String PATH_TO_GARUDA_LOGO = "/reports/garuda.png";
	
	public static final String RPT_TEST_CETAK_XLS = "rptTestCetakXls";

	/** The default directory. */
	private static String defaultDirectory = "/reports/";
	/** The rpt Test. */
	private static String rptTest = defaultDirectory + "rptTest.jasper";

	public static String getRptTest() {
		return rptTest;
	}

	/** The rpt Test. */
	private static String rptProfilPns = defaultDirectory
			+ "rptProfilPns.jasper";

	public static String getRptProfilPnst() {
		return rptProfilPns;
	}
}
