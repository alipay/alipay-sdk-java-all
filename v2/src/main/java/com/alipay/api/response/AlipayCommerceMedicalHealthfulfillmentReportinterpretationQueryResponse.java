package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReportInterpretationDetailResponse;
import com.alipay.api.domain.ReportDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthfulfillment.reportinterpretation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 17:57:56
 */
public class AlipayCommerceMedicalHealthfulfillmentReportinterpretationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1325922547533958367L;

	/** 
	 * 报告解读结果
	 */
	@ApiField("interpretation_result")
	private ReportInterpretationDetailResponse interpretationResult;

	/** 
	 * null
	 */
	@ApiListField("report_list")
	@ApiField("report_detail_response")
	private List<ReportDetailResponse> reportList;

	public void setInterpretationResult(ReportInterpretationDetailResponse interpretationResult) {
		this.interpretationResult = interpretationResult;
	}
	public ReportInterpretationDetailResponse getInterpretationResult( ) {
		return this.interpretationResult;
	}

	public void setReportList(List<ReportDetailResponse> reportList) {
		this.reportList = reportList;
	}
	public List<ReportDetailResponse> getReportList( ) {
		return this.reportList;
	}

}
