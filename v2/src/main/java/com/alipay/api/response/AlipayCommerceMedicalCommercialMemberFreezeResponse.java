package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.member.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 14:43:07
 */
public class AlipayCommerceMedicalCommercialMemberFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3122325736589497341L;

	/** 
	 * 外部商户商品ID
	 */
	@ApiField("out_product_id")
	private String outProductId;

	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}
	public String getOutProductId( ) {
		return this.outProductId;
	}

}
