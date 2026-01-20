package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowdpool.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 11:37:04
 */
public class AlipayMerchantQipanCrowdpoolCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7155415182383374767L;

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
