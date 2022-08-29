package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.nucleicremind.subscribe.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-26 17:26:43
 */
public class AlipayEbppIndustryNucleicremindSubscribeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3692538134753375198L;

	/** 
	 * 有效时间，单位小时
当订阅状态为已订阅时改字段有值
	 */
	@ApiField("effective_hour")
	private String effectiveHour;

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
