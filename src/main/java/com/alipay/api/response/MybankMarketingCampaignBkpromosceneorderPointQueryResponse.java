package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromosceneorder.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:39:18
 */
public class MybankMarketingCampaignBkpromosceneorderPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8513495861155568164L;

	/** 
	 * 用户当前的可用积分
	 */
	@ApiField("point")
	private Long point;

	public void setPoint(Long point) {
		this.point = point;
	}
	public Long getPoint( ) {
		return this.point;
	}

}
