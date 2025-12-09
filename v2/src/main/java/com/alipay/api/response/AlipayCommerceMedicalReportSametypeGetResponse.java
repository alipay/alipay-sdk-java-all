package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReportInfoDTO;
import com.alipay.api.domain.SameTypeReportInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.report.sametype.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 14:07:42
 */
public class AlipayCommerceMedicalReportSametypeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1363134431257884282L;

	/** 
	 * 主报告
	 */
	@ApiField("main_report")
	private ReportInfoDTO mainReport;

	/** 
	 * null
	 */
	@ApiListField("same_type_report")
	@ApiField("same_type_report_info_d_t_o")
	private List<SameTypeReportInfoDTO> sameTypeReport;

	public void setMainReport(ReportInfoDTO mainReport) {
		this.mainReport = mainReport;
	}
	public ReportInfoDTO getMainReport( ) {
		return this.mainReport;
	}

	public void setSameTypeReport(List<SameTypeReportInfoDTO> sameTypeReport) {
		this.sameTypeReport = sameTypeReport;
	}
	public List<SameTypeReportInfoDTO> getSameTypeReport( ) {
		return this.sameTypeReport;
	}

}
