package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.playsignin.count.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 16:34:39
 */
public class AlipayMarketingCampaignPlaysigninCountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4752259747199197772L;

	/** 
	 * 连续签到次数
	 */
	@ApiField("continuous_num")
	private Long continuousNum;

	/** 
	 * 累计签到次数
	 */
	@ApiField("cumulative_num")
	private Long cumulativeNum;

	public void setContinuousNum(Long continuousNum) {
		this.continuousNum = continuousNum;
	}
	public Long getContinuousNum( ) {
		return this.continuousNum;
	}

	public void setCumulativeNum(Long cumulativeNum) {
		this.cumulativeNum = cumulativeNum;
	}
	public Long getCumulativeNum( ) {
		return this.cumulativeNum;
	}

}
