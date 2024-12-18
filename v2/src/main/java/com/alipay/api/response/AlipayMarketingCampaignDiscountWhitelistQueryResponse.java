package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.whitelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 13:34:00
 */
public class AlipayMarketingCampaignDiscountWhitelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1849613742354853666L;

	/** 
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动id.白名单,","隔开，最多100个
	 */
	@ApiField("user_white_list")
	private String userWhiteList;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setUserWhiteList(String userWhiteList) {
		this.userWhiteList = userWhiteList;
	}
	public String getUserWhiteList( ) {
		return this.userWhiteList;
	}

}
