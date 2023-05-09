package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.pay.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:11:58
 */
public class AlipayMerchantPayforprivilegePayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4816641483833554832L;

	/** 
	 * 充值资金单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 用于唤起资金授权支付的orderStr参数
	 */
	@ApiField("order_str")
	private String orderStr;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
