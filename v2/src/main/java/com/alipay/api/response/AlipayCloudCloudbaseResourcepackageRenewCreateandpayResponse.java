package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.renew.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 15:47:51
 */
public class AlipayCloudCloudbaseResourcepackageRenewCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6329184729771638877L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 续费下单并支付结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
