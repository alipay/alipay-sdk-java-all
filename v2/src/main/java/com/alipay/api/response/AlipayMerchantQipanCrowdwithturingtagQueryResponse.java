package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowdwithturingtag.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-04 15:26:55
 */
public class AlipayMerchantQipanCrowdwithturingtagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8195117779374837416L;

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
