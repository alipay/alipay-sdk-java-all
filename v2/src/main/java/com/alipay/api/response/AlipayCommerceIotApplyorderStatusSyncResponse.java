package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.applyorder.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:12:28
 */
public class AlipayCommerceIotApplyorderStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4312148837449272281L;

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
