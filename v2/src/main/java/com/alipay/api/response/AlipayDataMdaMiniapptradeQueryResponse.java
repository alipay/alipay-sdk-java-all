package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.miniapptrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:41:44
 */
public class AlipayDataMdaMiniapptradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2599658664216362675L;

	/** 
	 * 今日告警趋势、响应趋势
	 */
	@ApiField("resp_alarm_trend")
	private String respAlarmTrend;

	/** 
	 * 告警响应率
	 */
	@ApiField("trade_alarm_response_rate")
	private String tradeAlarmResponseRate;

	/** 
	 * 调用平均耗时
	 */
	@ApiField("trade_avg_cost")
	private String tradeAvgCost;

	/** 
	 * 支付接口调用成功率
	 */
	@ApiField("trade_success_rate")
	private String tradeSuccessRate;

	/** 
	 * 支付接口调用成功量
	 */
	@ApiField("trade_today_interface_success")
	private Long tradeTodayInterfaceSuccess;

	/** 
	 * 今日累计成功量
	 */
	@ApiField("trade_today_total_success")
	private Long tradeTodayTotalSuccess;

	/** 
	 * 今日累计告警次数
	 */
	@ApiField("trade_total_fault")
	private Long tradeTotalFault;

	/** 
	 * 今日累计告警响应
	 */
	@ApiField("trade_total_resp_count")
	private Long tradeTotalRespCount;

	public void setRespAlarmTrend(String respAlarmTrend) {
		this.respAlarmTrend = respAlarmTrend;
	}
	public String getRespAlarmTrend( ) {
		return this.respAlarmTrend;
	}

	public void setTradeAlarmResponseRate(String tradeAlarmResponseRate) {
		this.tradeAlarmResponseRate = tradeAlarmResponseRate;
	}
	public String getTradeAlarmResponseRate( ) {
		return this.tradeAlarmResponseRate;
	}

	public void setTradeAvgCost(String tradeAvgCost) {
		this.tradeAvgCost = tradeAvgCost;
	}
	public String getTradeAvgCost( ) {
		return this.tradeAvgCost;
	}

	public void setTradeSuccessRate(String tradeSuccessRate) {
		this.tradeSuccessRate = tradeSuccessRate;
	}
	public String getTradeSuccessRate( ) {
		return this.tradeSuccessRate;
	}

	public void setTradeTodayInterfaceSuccess(Long tradeTodayInterfaceSuccess) {
		this.tradeTodayInterfaceSuccess = tradeTodayInterfaceSuccess;
	}
	public Long getTradeTodayInterfaceSuccess( ) {
		return this.tradeTodayInterfaceSuccess;
	}

	public void setTradeTodayTotalSuccess(Long tradeTodayTotalSuccess) {
		this.tradeTodayTotalSuccess = tradeTodayTotalSuccess;
	}
	public Long getTradeTodayTotalSuccess( ) {
		return this.tradeTodayTotalSuccess;
	}

	public void setTradeTotalFault(Long tradeTotalFault) {
		this.tradeTotalFault = tradeTotalFault;
	}
	public Long getTradeTotalFault( ) {
		return this.tradeTotalFault;
	}

	public void setTradeTotalRespCount(Long tradeTotalRespCount) {
		this.tradeTotalRespCount = tradeTotalRespCount;
	}
	public Long getTradeTotalRespCount( ) {
		return this.tradeTotalRespCount;
	}

}
