package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-25 17:36:44
 */
public class ZhimaCreditEpReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3889432741418813515L;

	/** 
	 * 信用报告的下载链接
	 */
	@ApiField("report_url")
	private String reportUrl;

	public void setReportUrl(String reportUrl) {
		this.reportUrl = reportUrl;
	}
	public String getReportUrl( ) {
		return this.reportUrl;
	}

}
