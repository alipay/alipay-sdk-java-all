package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.common.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-21 17:12:32
 */
public class AlipaySecurityRiskVerifyidentityCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3113822428666727239L;

	/** 
	 * 无
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 成功/失败code
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private String success;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
