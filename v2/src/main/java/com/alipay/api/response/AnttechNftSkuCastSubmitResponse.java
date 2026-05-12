package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.sku.cast.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 17:22:45
 */
public class AnttechNftSkuCastSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2384183392691641313L;

	/** 
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
