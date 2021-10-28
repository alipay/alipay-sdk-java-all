package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.inquiry.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 16:45:52
 */
public class AlipayInsSceneProductInquiryApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8257819131316631977L;

	/** 
	 * 保险产品保费值，金额类型(单位为分)
	 */
	@ApiField("premium")
	private Long premium;

	public void setPremium(Long premium) {
		this.premium = premium;
	}
	public Long getPremium( ) {
		return this.premium;
	}

}
