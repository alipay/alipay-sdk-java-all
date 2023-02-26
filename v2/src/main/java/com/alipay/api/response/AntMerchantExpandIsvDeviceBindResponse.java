package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.device.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:03:10
 */
public class AntMerchantExpandIsvDeviceBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8172351599692234254L;

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
