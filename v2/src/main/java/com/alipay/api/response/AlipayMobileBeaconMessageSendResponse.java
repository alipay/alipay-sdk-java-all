package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.beacon.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:48:23
 */
public class AlipayMobileBeaconMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6839591273972772668L;

	/** 
	 * 操作返回码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 操作提示文案
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
