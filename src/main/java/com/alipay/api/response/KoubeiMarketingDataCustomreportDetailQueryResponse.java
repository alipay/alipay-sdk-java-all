package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CustomReportCondition;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-27 11:17:39
 */
public class KoubeiMarketingDataCustomreportDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7882396542554957581L;

	/** 
	 * 自定义报表规则条件的详细信息
	 */
	@ApiField("report_condition_info")
	private CustomReportCondition reportConditionInfo;

	public void setReportConditionInfo(CustomReportCondition reportConditionInfo) {
		this.reportConditionInfo = reportConditionInfo;
	}
	public CustomReportCondition getReportConditionInfo( ) {
		return this.reportConditionInfo;
	}

}
