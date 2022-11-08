package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.nucleicremind.subscribe.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-31 20:21:55
 */
public class AlipayEbppIndustryNucleicremindSubscribeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2517776816139859851L;

	/** 
	 * 有效时间，单位小时
当订阅状态为已订阅时改字段有值
	 */
	@ApiField("effective_hour")
	private String effectiveHour;

	/** 
	 * 返回用户订阅提醒的小时数列表
	 */
	@ApiListField("reminder_hour_list")
	@ApiField("number")
	private List<Long> reminderHourList;

	/** 
	 * 最新一次核酸报告时间，当订阅状态为已订阅时，改字段返回
	 */
	@ApiField("result_time")
	private String resultTime;

	/** 
	 * 1 为已订阅，0 为未订阅，-1 为业务异常需要降级
	 */
	@ApiField("status")
	private String status;

	public void setEffectiveHour(String effectiveHour) {
		this.effectiveHour = effectiveHour;
	}
	public String getEffectiveHour( ) {
		return this.effectiveHour;
	}

	public void setReminderHourList(List<Long> reminderHourList) {
		this.reminderHourList = reminderHourList;
	}
	public List<Long> getReminderHourList( ) {
		return this.reminderHourList;
	}

	public void setResultTime(String resultTime) {
		this.resultTime = resultTime;
	}
	public String getResultTime( ) {
		return this.resultTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
