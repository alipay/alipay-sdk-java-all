package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:43:16
 */
public class KoubeiMerchantOperatorUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8694552791424543815L;

	/** 
	 * 操作结果 true: success, false: failed
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
