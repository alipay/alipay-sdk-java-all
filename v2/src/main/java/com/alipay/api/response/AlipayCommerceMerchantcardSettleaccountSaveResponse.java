package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.settleaccount.save response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 16:52:08
 */
public class AlipayCommerceMerchantcardSettleaccountSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4824793735179478284L;

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
