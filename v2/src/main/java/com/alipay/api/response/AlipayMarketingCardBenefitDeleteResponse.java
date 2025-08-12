package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:03
 */
public class AlipayMarketingCardBenefitDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6759996955747765667L;

	/** 
	 * 权益删除结果；true成功，false失败
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
