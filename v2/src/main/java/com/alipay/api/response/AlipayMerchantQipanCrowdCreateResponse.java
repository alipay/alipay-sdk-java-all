package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-18 16:44:28
 */
public class AlipayMerchantQipanCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1679922748255338965L;

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
