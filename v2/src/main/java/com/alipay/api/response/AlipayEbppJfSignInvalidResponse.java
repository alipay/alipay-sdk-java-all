package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.sign.invalid response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 09:56:42
 */
public class AlipayEbppJfSignInvalidResponse extends AlipayResponse {

	private static final long serialVersionUID = 5791294161178925868L;

	/** 
	 * 解约结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 解约结果的描述
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
