package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.authentication.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-28 15:19:58
 */
public class AlipaySecurityRiskAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1144137963297544579L;

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
