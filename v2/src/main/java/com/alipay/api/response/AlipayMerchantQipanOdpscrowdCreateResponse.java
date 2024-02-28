package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.odpscrowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-05 17:21:57
 */
public class AlipayMerchantQipanOdpscrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5265355563943638993L;

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
