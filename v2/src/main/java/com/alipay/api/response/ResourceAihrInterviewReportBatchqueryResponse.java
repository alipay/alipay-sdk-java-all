package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenapiInterviewReportItemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: resource.aihr.interview.report.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:49
 */
public class ResourceAihrInterviewReportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7385492288577726846L;

	/** 
	 * null
	 */
	@ApiListField("report_list")
	@ApiField("openapi_interview_report_item_d_t_o")
	private List<OpenapiInterviewReportItemDTO> reportList;

	public void setReportList(List<OpenapiInterviewReportItemDTO> reportList) {
		this.reportList = reportList;
	}
	public List<OpenapiInterviewReportItemDTO> getReportList( ) {
		return this.reportList;
	}

}
