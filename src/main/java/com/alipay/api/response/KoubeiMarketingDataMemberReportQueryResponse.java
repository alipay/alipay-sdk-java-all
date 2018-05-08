package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.member.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-23 14:16:19
 */
public class KoubeiMarketingDataMemberReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4111656665339648171L;

	/** 
	 * 查询成功时返回json格式数据
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
