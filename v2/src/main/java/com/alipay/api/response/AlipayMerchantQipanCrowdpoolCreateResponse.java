package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowdpool.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-11 14:06:40
 */
public class AlipayMerchantQipanCrowdpoolCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1888395755464218425L;

	/** 
	 * 棋盘人群编号
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
