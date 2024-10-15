package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.beacon.device.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:17
 */
public class AlipayMobileBeaconDeviceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8733616364382338539L;

	/** 
	 * 返回的操作码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 操作结果说明
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
