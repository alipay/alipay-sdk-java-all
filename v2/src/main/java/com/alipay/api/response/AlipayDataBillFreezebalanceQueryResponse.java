package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.freezebalance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-10 10:55:05
 */
public class AlipayDataBillFreezebalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6775499493928822476L;

	/** 
	 * 冻结金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

}
