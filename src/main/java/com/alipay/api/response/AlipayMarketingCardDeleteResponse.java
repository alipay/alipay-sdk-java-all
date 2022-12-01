package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 21:26:23
 */
public class AlipayMarketingCardDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2553379157363447743L;

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
