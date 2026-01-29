package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取同类型报告
 *
 * @author auto create
 * @since 1.0, 2025-12-03 14:07:42
 */
public class AlipayCommerceMedicalReportSametypeGetModel extends AlipayObject {

	private static final long serialVersionUID = 7779915615781372784L;

	/**
	 * 主报告
	 */
	@ApiField("main_report")
	private ReportInfoDTO mainReport;

	/**
	 * null
	 */
	@ApiListField("other_reports")
	@ApiField("report_info_d_t_o")
	private List<ReportInfoDTO> otherReports;

	public ReportInfoDTO getMainReport() {
		return this.mainReport;
	}
	public void setMainReport(ReportInfoDTO mainReport) {
		this.mainReport = mainReport;
	}

	public List<ReportInfoDTO> getOtherReports() {
		return this.otherReports;
	}
	public void setOtherReports(List<ReportInfoDTO> otherReports) {
		this.otherReports = otherReports;
	}

}
