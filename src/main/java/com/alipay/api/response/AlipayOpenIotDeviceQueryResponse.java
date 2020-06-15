package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iot.device.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-12 22:52:26
 */
public class AlipayOpenIotDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4463628337245166991L;

	/** 
	 * 设备商户绑定关系列表，如果没有查到绑定信息，则该字段结果为空
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
