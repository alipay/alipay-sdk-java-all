package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.carservicesaastldc.authentication.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 17:27:41
 */
public class AlipayCommerceOperationCarservicesaastldcAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4834354744516811285L;

	/** 
	 * 认证编号，需要在2个小时内发起认证，过期无效。
	 */
	@ApiField("auth_no")
	private String authNo;

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

}
