package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.authentication.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class AlipaySecurityRiskAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2191544686136831716L;

	/** 
	 * 身份安全业务相关查询业务信息
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
