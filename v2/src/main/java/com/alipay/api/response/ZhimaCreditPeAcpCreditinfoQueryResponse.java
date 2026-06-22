package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.acp.creditinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-01 15:27:49
 */
public class ZhimaCreditPeAcpCreditinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6813991834498563449L;

	/** 
	 * 智能体是否获得授权
	 */
	@ApiField("auth")
	private String auth;

	/** 
	 * 信用等级
	 */
	@ApiField("credit_level_code")
	private String creditLevelCode;

	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getAuth( ) {
		return this.auth;
	}

	public void setCreditLevelCode(String creditLevelCode) {
		this.creditLevelCode = creditLevelCode;
	}
	public String getCreditLevelCode( ) {
		return this.creditLevelCode;
	}

}
