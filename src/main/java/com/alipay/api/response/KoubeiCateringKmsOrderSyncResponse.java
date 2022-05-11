package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kms.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-24 18:51:21
 */
public class KoubeiCateringKmsOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4682486273119937787L;

	/** 
	 * 开发者提示信息, 如果重复推单或重复退款, 会通过这个字段提示,  无其他业务作用.
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
