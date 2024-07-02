package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.crowdwithtag.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:51:00
 */
public class AlipayMarketingQipanCrowdwithtagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3695821589497391959L;

	/** 
	 * 人群数量
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 人群规模
	 */
	@ApiField("count_range")
	private String countRange;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setCountRange(String countRange) {
		this.countRange = countRange;
	}
	public String getCountRange( ) {
		return this.countRange;
	}

}
