package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-11 10:12:00
 */
public class AlipayFundAccountCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8779992595256538827L;

	/** 
	 * 校验结果
Y：一致
N：不一致
	 */
	@ApiField("check_result")
	private String checkResult;

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getCheckResult( ) {
		return this.checkResult;
	}

}
