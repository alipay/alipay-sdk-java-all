package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromosceneorder.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 17:50:04
 */
public class MybankMarketingCampaignBkpromosceneorderPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1262835345666953897L;

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
