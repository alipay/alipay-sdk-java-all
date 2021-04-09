package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CustomReportCondition;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-31 10:35:21
 */
public class KoubeiMarketingDataCustomreportDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3728337256331167545L;

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
