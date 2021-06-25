package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.devicemodel.add response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-06 10:10:13
 */
public class AlipayOpenMiniAmpeDevicemodelAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2657465176917427147L;

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
