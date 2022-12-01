package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-28 20:11:34
 */
public class AlipayMerchantQipanCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5764853415317487895L;

	/** 
	 * 支付宝人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}
	public String getCrowdCode( ) {
		return this.crowdCode;
	}

}
