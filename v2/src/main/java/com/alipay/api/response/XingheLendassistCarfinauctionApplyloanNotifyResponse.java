package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.carfinauction.applyloan.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-17 13:46:52
 */
public class XingheLendassistCarfinauctionApplyloanNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8477897814313493933L;

	/** 
	 * 预计放款时间
	 */
	@ApiField("disburse_time")
	private String disburseTime;

	public void setDisburseTime(String disburseTime) {
		this.disburseTime = disburseTime;
	}
	public String getDisburseTime( ) {
		return this.disburseTime;
	}

}
