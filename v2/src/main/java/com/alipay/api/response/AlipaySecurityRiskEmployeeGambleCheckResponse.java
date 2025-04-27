package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.employee.gamble.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-08 10:57:25
 */
public class AlipaySecurityRiskEmployeeGambleCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1215166122942366944L;

	/** 
	 * 核验token
	 */
	@ApiField("accept_no")
	private String acceptNo;

	/** 
	 * 请求id
	 */
	@ApiField("request_no")
	private String requestNo;

	public void setAcceptNo(String acceptNo) {
		this.acceptNo = acceptNo;
	}
	public String getAcceptNo( ) {
		return this.acceptNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

}
