package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.bless.bodhileaf.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-15 22:12:57
 */
public class AnttechNftBlessBodhileafSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7676913191987112667L;

	/** 
	 * 实际扣减数值
	 */
	@ApiField("actual_deduct_value")
	private Long actualDeductValue;

	public void setActualDeductValue(Long actualDeductValue) {
		this.actualDeductValue = actualDeductValue;
	}
	public Long getActualDeductValue( ) {
		return this.actualDeductValue;
	}

}
