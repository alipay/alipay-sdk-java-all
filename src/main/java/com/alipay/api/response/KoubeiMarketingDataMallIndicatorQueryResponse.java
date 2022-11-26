package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.indicator.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-02 11:15:16
 */
public class KoubeiMarketingDataMallIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8334672169883886472L;

	/** 
	 * JSON格式数组，每个对象表示一个门店某个具体日期的指标信息，KEY为指标代码，VALUE为该指标对应的值。注意返回的json数组和查询的字段biz_type的值的不同会有差异，并且返回值会直接展示返回对象的字段。对应关系为:
mallIndustryMemberStatistics ==> mall_industry_member_statistics
mallIndustryTradeStatistics ==> mall_industry_trade_statistics
mallIndustryEventStatistics ==> mall_industry_event_statistics
mallIndustryInfo ==> mall_industry_info
mallIndustryConsumptionStatistics ==> mall_industry_consumption_statistics
	 */
	@ApiField("indicator_infos")
	private String indicatorInfos;

	/** 
	 * 总条目数,供计算分页信息使用
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setIndicatorInfos(String indicatorInfos) {
		this.indicatorInfos = indicatorInfos;
	}
	public String getIndicatorInfos( ) {
		return this.indicatorInfos;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
