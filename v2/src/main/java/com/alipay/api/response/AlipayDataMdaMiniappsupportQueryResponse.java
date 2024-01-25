package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.miniappsupport.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 23:06:44
 */
public class AlipayDataMdaMiniappsupportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4219482642574892514L;

	/** 
	 * 智能服务日环比
	 */
	@ApiField("ai_service_ratio")
	private String aiServiceRatio;

	/** 
	 * 客户满意度
	 */
	@ApiField("customer_satisfaction")
	private String customerSatisfaction;

	/** 
	 * 人工服务日环比
	 */
	@ApiField("manual_service_ratio")
	private String manualServiceRatio;

	/** 
	 * 今日智能服务总量
	 */
	@ApiField("today_ai_service_cnt")
	private Long todayAiServiceCnt;

	/** 
	 * 今日人工服务总量
	 */
	@ApiField("today_manual_service_cnt")
	private Long todayManualServiceCnt;

	/** 
	 * 今日人工、智能服务量趋势
	 */
	@ApiField("today_service_trend")
	private String todayServiceTrend;

	/** 
	 * 智能服务总量
	 */
	@ApiField("total_ai_service_cnt")
	private Long totalAiServiceCnt;

	/** 
	 * 人工服务总量
	 */
	@ApiField("total_manual_service_cnt")
	private Long totalManualServiceCnt;

	/** 
	 * 词云
	 */
	@ApiField("word_cloud")
	private String wordCloud;

	/** 
	 * 昨日智能服务总量
	 */
	@ApiField("yesterday_ai_service_cnt")
	private Long yesterdayAiServiceCnt;

	/** 
	 * 昨日人工服务总量
	 */
	@ApiField("yesterday_manual_service_cnt")
	private Long yesterdayManualServiceCnt;

	/** 
	 * 昨日人工、智能服务量趋势
	 */
	@ApiField("yesterday_service_trend")
	private String yesterdayServiceTrend;

	public void setAiServiceRatio(String aiServiceRatio) {
		this.aiServiceRatio = aiServiceRatio;
	}
	public String getAiServiceRatio( ) {
		return this.aiServiceRatio;
	}

	public void setCustomerSatisfaction(String customerSatisfaction) {
		this.customerSatisfaction = customerSatisfaction;
	}
	public String getCustomerSatisfaction( ) {
		return this.customerSatisfaction;
	}

	public void setManualServiceRatio(String manualServiceRatio) {
		this.manualServiceRatio = manualServiceRatio;
	}
	public String getManualServiceRatio( ) {
		return this.manualServiceRatio;
	}

	public void setTodayAiServiceCnt(Long todayAiServiceCnt) {
		this.todayAiServiceCnt = todayAiServiceCnt;
	}
	public Long getTodayAiServiceCnt( ) {
		return this.todayAiServiceCnt;
	}

	public void setTodayManualServiceCnt(Long todayManualServiceCnt) {
		this.todayManualServiceCnt = todayManualServiceCnt;
	}
	public Long getTodayManualServiceCnt( ) {
		return this.todayManualServiceCnt;
	}

	public void setTodayServiceTrend(String todayServiceTrend) {
		this.todayServiceTrend = todayServiceTrend;
	}
	public String getTodayServiceTrend( ) {
		return this.todayServiceTrend;
	}

	public void setTotalAiServiceCnt(Long totalAiServiceCnt) {
		this.totalAiServiceCnt = totalAiServiceCnt;
	}
	public Long getTotalAiServiceCnt( ) {
		return this.totalAiServiceCnt;
	}

	public void setTotalManualServiceCnt(Long totalManualServiceCnt) {
		this.totalManualServiceCnt = totalManualServiceCnt;
	}
	public Long getTotalManualServiceCnt( ) {
		return this.totalManualServiceCnt;
	}

	public void setWordCloud(String wordCloud) {
		this.wordCloud = wordCloud;
	}
	public String getWordCloud( ) {
		return this.wordCloud;
	}

	public void setYesterdayAiServiceCnt(Long yesterdayAiServiceCnt) {
		this.yesterdayAiServiceCnt = yesterdayAiServiceCnt;
	}
	public Long getYesterdayAiServiceCnt( ) {
		return this.yesterdayAiServiceCnt;
	}

	public void setYesterdayManualServiceCnt(Long yesterdayManualServiceCnt) {
		this.yesterdayManualServiceCnt = yesterdayManualServiceCnt;
	}
	public Long getYesterdayManualServiceCnt( ) {
		return this.yesterdayManualServiceCnt;
	}

	public void setYesterdayServiceTrend(String yesterdayServiceTrend) {
		this.yesterdayServiceTrend = yesterdayServiceTrend;
	}
	public String getYesterdayServiceTrend( ) {
		return this.yesterdayServiceTrend;
	}

}
