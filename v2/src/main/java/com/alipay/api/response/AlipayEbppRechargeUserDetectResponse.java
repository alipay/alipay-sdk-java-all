package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.user.detect response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:26:57
 */
public class AlipayEbppRechargeUserDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7432933567378928326L;

	/** 
	 * 是否是合法用户
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
