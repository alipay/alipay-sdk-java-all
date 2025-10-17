package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.beacon.device.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:42:36
 */
public class AlipayMobileBeaconDeviceAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2363991288751879696L;

	/** 
	 * 请求操作成功与否，200为成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 请求的处理结果
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
