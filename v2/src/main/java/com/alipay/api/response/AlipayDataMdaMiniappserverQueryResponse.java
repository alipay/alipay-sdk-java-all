package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.miniappserver.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:28:33
 */
public class AlipayDataMdaMiniappserverQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4153121154931384153L;

	/** 
	 * 平均恢复耗时(分钟)
	 */
	@ApiField("average_recovery_cost_mins")
	private Long averageRecoveryCostMins;

	/** 
	 * 访问成功率
	 */
	@ApiField("success_rate")
	private Long successRate;

	/** 
	 * 今日告警次数
	 */
	@ApiField("today_alarm_number")
	private Long todayAlarmNumber;

	/** 
	 * 今日告警响应率
	 */
	@ApiField("today_alarm_response_rate")
	private Long todayAlarmResponseRate;

	public void setAverageRecoveryCostMins(Long averageRecoveryCostMins) {
		this.averageRecoveryCostMins = averageRecoveryCostMins;
	}
	public Long getAverageRecoveryCostMins( ) {
		return this.averageRecoveryCostMins;
	}

	public void setSuccessRate(Long successRate) {
		this.successRate = successRate;
	}
	public Long getSuccessRate( ) {
		return this.successRate;
	}

	public void setTodayAlarmNumber(Long todayAlarmNumber) {
		this.todayAlarmNumber = todayAlarmNumber;
	}
	public Long getTodayAlarmNumber( ) {
		return this.todayAlarmNumber;
	}

	public void setTodayAlarmResponseRate(Long todayAlarmResponseRate) {
		this.todayAlarmResponseRate = todayAlarmResponseRate;
	}
	public Long getTodayAlarmResponseRate( ) {
		return this.todayAlarmResponseRate;
	}

}
