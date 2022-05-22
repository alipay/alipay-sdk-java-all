package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.activity.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 15:08:24
 */
public class KoubeiMarketingDataActivityReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5514148617292653734L;

	/** 
	 * 报表
	 */
	@ApiField("report_data")
	private String reportData;

	public void setReportData(String reportData) {
		this.reportData = reportData;
	}
	public String getReportData( ) {
		return this.reportData;
	}

}
