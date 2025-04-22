package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-20 16:08:49
 */
public class AlipayMarketingCardDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2531676248381453551L;

	/** 
	 * 支付宝端删卡业务流水号
	 */
	@ApiField("biz_serial_no")
	private String bizSerialNo;

	public void setBizSerialNo(String bizSerialNo) {
		this.bizSerialNo = bizSerialNo;
	}
	public String getBizSerialNo( ) {
		return this.bizSerialNo;
	}

}
