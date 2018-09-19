package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.device.bind response.
 * 
 * @author auto create
 * @since 1.0, 2018-08-23 19:57:46
 */
public class AntMerchantExpandIsvDeviceBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6664414682382148365L;

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
