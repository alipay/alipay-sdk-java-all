package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.YunTaskSummaryStatistic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.summarystatistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-24 12:22:01
 */
public class AlipayCommerceYuntaskSummarystatisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3683682338836217938L;

	/** 
	 * 业绩汇总数据
	 */
	@ApiField("summary_statistic")
	private YunTaskSummaryStatistic summaryStatistic;

	public void setSummaryStatistic(YunTaskSummaryStatistic summaryStatistic) {
		this.summaryStatistic = summaryStatistic;
	}
	public YunTaskSummaryStatistic getSummaryStatistic( ) {
		return this.summaryStatistic;
	}

}
