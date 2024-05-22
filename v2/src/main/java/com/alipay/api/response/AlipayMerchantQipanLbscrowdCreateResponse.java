package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.lbscrowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-11 14:01:40
 */
public class AlipayMerchantQipanLbscrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5631792897654214814L;

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
