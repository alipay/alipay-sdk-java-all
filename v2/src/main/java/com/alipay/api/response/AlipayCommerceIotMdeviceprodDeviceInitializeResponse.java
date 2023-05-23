package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.device.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:47:36
 */
public class AlipayCommerceIotMdeviceprodDeviceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5891998942125175788L;

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
