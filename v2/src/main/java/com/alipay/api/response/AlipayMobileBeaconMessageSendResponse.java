package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.beacon.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:45:50
 */
public class AlipayMobileBeaconMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5146898348118579368L;

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
