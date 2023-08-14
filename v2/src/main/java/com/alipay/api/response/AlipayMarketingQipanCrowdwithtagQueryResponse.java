package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.crowdwithtag.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 22:36:53
 */
public class AlipayMarketingQipanCrowdwithtagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7817674969499288247L;

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
