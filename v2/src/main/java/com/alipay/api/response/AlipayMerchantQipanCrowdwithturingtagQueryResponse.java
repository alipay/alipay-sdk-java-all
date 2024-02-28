package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowdwithturingtag.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:42:01
 */
public class AlipayMerchantQipanCrowdwithturingtagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1365835692427479723L;

	/** 
	 * 人群规模
	 */
	@ApiField("count_range")
	private String countRange;

	public void setCountRange(String countRange) {
		this.countRange = countRange;
	}
	public String getCountRange( ) {
		return this.countRange;
	}

}
