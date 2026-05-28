package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.cyclepay.prenotify.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-20 20:52:45
 */
public class AlipayUserCyclepayPrenotifyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7311121628937339815L;

	/** 
	 * 商户代扣扣款许可生效结束时间
	 */
	@ApiField("effective_time_end")
	private String effectiveTimeEnd;

	/** 
	 * 商户代扣扣款许可生效开始时间
	 */
	@ApiField("effective_time_start")
	private String effectiveTimeStart;

	public void setEffectiveTimeEnd(String effectiveTimeEnd) {
		this.effectiveTimeEnd = effectiveTimeEnd;
	}
	public String getEffectiveTimeEnd( ) {
		return this.effectiveTimeEnd;
	}

	public void setEffectiveTimeStart(String effectiveTimeStart) {
		this.effectiveTimeStart = effectiveTimeStart;
	}
	public String getEffectiveTimeStart( ) {
		return this.effectiveTimeStart;
	}

}
