package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.identify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityRiskVerifyidentityIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7727752812822241114L;

	/** 
	 * 核身校验结果，true表示核身通过，false表示核身失败
	 */
	@ApiField("identify_result")
	private Boolean identifyResult;

	public void setIdentifyResult(Boolean identifyResult) {
		this.identifyResult = identifyResult;
	}
	public Boolean getIdentifyResult( ) {
		return this.identifyResult;
	}

}
