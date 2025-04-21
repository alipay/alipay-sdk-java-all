package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.device.bind response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-30 11:24:33
 */
public class AntMerchantExpandIsvDeviceBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8471276373627461299L;

	/** 
	 * 申请单id
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
