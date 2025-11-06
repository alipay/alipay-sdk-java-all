package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.greyblackcrowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-24 11:27:26
 */
public class AlipayMerchantQipanGreyblackcrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3531174159524182574L;

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
