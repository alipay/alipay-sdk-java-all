package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.carservicesaastldc.authentication.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 17:27:41
 */
public class AlipayCommerceOperationCarservicesaastldcAuthenticationQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 5269755991453388124L;

	/** 
	 * 身份认证编号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * SUCCESS代表可信，FAIL代表不可信，AUTHING代表未知需要等待结果
	 */
	@ApiField("auth_result")
	private String authResult;

	/** 
	 * 身份认证类型
	 */
	@ApiField("auth_type")
	private String authType;

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

	public void setAuthResult(String authResult) {
		this.authResult = authResult;
	}
	public String getAuthResult( ) {
		return this.authResult;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public String getAuthType( ) {
		return this.authType;
	}

}
