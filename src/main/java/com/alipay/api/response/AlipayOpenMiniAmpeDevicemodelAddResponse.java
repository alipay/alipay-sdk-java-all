package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.devicemodel.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:57:01
 */
public class AlipayOpenMiniAmpeDevicemodelAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7522622276754469591L;

	/** 
	 * 设备机型id
	 */
	@ApiField("device_model_id")
	private Long deviceModelId;

	public void setDeviceModelId(Long deviceModelId) {
		this.deviceModelId = deviceModelId;
	}
	public Long getDeviceModelId( ) {
		return this.deviceModelId;
	}

}
