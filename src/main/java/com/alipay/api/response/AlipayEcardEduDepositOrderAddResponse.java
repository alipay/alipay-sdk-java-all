package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.deposit.order.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-31 20:40:46
 */
public class AlipayEcardEduDepositOrderAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5769147319545228873L;

	/** 
	 * 支付申请流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
