package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowd.spread response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-17 10:35:41
 */
public class AlipayMerchantQipanCrowdSpreadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5557822886517993913L;

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
