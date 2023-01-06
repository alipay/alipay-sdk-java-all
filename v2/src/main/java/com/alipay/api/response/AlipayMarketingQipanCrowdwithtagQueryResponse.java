package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.crowdwithtag.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 16:56:39
 */
public class AlipayMarketingQipanCrowdwithtagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5115535662738373799L;

	/** 
	 * 人群数量
	 */
	@ApiField("count")
	private String count;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

}
