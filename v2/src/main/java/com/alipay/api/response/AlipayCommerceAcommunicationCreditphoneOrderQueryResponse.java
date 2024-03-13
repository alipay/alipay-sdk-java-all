package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-26 10:44:02
 */
public class AlipayCommerceAcommunicationCreditphoneOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3771374232835617543L;

	/** 
	 * 信用购主单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 已支付
	 */
	@ApiField("status")
	private String status;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
