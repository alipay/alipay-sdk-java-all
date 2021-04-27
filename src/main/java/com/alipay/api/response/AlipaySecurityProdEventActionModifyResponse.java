package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.event.action.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-14 17:35:39
 */
public class AlipaySecurityProdEventActionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2695832748797515921L;

	/** 
	 * 返回状态码 200 成功 500 失败
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
