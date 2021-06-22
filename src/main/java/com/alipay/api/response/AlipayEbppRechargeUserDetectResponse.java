package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.user.detect response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-30 18:58:49
 */
public class AlipayEbppRechargeUserDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7464425126331696331L;

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
