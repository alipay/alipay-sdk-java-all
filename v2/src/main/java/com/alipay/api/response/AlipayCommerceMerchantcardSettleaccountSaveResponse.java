package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.settleaccount.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-16 10:39:17
 */
public class AlipayCommerceMerchantcardSettleaccountSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4754875894776645279L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
