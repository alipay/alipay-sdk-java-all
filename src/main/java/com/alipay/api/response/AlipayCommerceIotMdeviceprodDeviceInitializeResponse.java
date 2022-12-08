package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.device.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:53:01
 */
public class AlipayCommerceIotMdeviceprodDeviceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4623753685164363729L;

	/** 
	 * 设备唯一标识
	 */
	@ApiField("biz_tid")
	private String bizTid;

	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}
	public String getBizTid( ) {
		return this.bizTid;
	}

}
