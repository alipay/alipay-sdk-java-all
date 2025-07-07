package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.exchange.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 16:02:32
 */
public class AlipayCommerceMedicalCardExchangeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4723199964428627972L;

	/** 
	 * 1-已开通   2-未开通
	 */
	@ApiField("open_status")
	private Long openStatus;

	/** 
	 * 秒级时间戳
	 */
	@ApiField("open_time")
	private Long openTime;

	public void setOpenStatus(Long openStatus) {
		this.openStatus = openStatus;
	}
	public Long getOpenStatus( ) {
		return this.openStatus;
	}

	public void setOpenTime(Long openTime) {
		this.openTime = openTime;
	}
	public Long getOpenTime( ) {
		return this.openTime;
	}

}
