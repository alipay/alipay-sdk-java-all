package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.event.action.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-09 17:03:56
 */
public class AlipaySecurityProdEventActionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6214666674485192223L;

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
