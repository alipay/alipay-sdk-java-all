package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantOperatorUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6297454728828847238L;

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
