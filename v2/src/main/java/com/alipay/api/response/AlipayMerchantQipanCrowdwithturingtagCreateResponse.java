package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowdwithturingtag.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:51:00
 */
public class AlipayMerchantQipanCrowdwithturingtagCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5116932568753553241L;

	/** 
	 * 圈选出的人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

}
