package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.applyorder.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:51:06
 */
public class AlipayCommerceIotApplyorderStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2693431723114483852L;

	/** 
	 * 该订单下关联的设备数量
	 */
	@ApiField("device_amount")
	private Long deviceAmount;

	public void setDeviceAmount(Long deviceAmount) {
		this.deviceAmount = deviceAmount;
	}
	public Long getDeviceAmount( ) {
		return this.deviceAmount;
	}

}
