package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.riskcontrol.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdFingerprintRiskcontrolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6819371697588532993L;

	/** 
	 * IFAA服务端查询结果，true为支持指纹功能，false为不支持
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}
	public Boolean getCheckResult( ) {
		return this.checkResult;
	}

}
