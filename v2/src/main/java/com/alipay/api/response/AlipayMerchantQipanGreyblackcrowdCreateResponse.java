package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.greyblackcrowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-21 13:40:26
 */
public class AlipayMerchantQipanGreyblackcrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8575779254866738664L;

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
