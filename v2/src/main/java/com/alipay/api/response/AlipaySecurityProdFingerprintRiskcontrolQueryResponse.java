package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.riskcontrol.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:52:35
 */
public class AlipaySecurityProdFingerprintRiskcontrolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5242747675841988484L;

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
