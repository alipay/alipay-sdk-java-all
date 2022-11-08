package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.order.notify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-26 10:26:43
 */
public class AlipayCommerceAcommunicationOrderNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8257928624229324558L;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 外部商家订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * SUCCESS结算成功
FAILED失败退款
	 */
	@ApiField("status")
	private String status;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
