package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-23 14:58:36
 */
public class KoubeiMerchantOperatorFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8754131218558982553L;

	/** 
	 * 操作结果 true:success, false: failed
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
