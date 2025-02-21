package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 11:33:43
 */
public class ZhimaCreditEpReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2575135533519774247L;

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
