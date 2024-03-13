package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowd.spread response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-11 11:36:40
 */
public class AlipayMerchantQipanCrowdSpreadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3878638968836619712L;

	/** 
	 * 人群编号
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
