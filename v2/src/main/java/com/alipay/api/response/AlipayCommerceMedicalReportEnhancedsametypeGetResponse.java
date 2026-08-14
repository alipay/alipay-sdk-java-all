package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReportInfoDTO;
import com.alipay.api.domain.EnhancedSameTypeReportInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.report.enhancedsametype.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-06 11:57:52
 */
public class AlipayCommerceMedicalReportEnhancedsametypeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7587599367535898196L;

	/** 
	 * 主报告
	 */
	@ApiField("main_report")
	private ReportInfoDTO mainReport;

	/** 
	 * null
	 */
	@ApiListField("same_type_report")
	@ApiField("enhanced_same_type_report_info_d_t_o")
	private List<EnhancedSameTypeReportInfoDTO> sameTypeReport;

	public void setMainReport(ReportInfoDTO mainReport) {
		this.mainReport = mainReport;
	}
	public ReportInfoDTO getMainReport( ) {
		return this.mainReport;
	}

	public void setSameTypeReport(List<EnhancedSameTypeReportInfoDTO> sameTypeReport) {
		this.sameTypeReport = sameTypeReport;
	}
	public List<EnhancedSameTypeReportInfoDTO> getSameTypeReport( ) {
		return this.sameTypeReport;
	}

}
