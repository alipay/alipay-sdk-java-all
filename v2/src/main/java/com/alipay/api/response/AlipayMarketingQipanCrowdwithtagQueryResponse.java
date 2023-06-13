package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.crowdwithtag.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:26:58
 */
public class AlipayMarketingQipanCrowdwithtagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2151522258336955954L;

	/** 
	 * 人群数量-暂不支持
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
