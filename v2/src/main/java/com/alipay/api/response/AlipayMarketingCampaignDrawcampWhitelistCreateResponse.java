package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.whitelist.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:36:41
 */
public class AlipayMarketingCampaignDrawcampWhitelistCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6625534467883899538L;

	/** 
	 * 操作结果状态，业务维度，网关返回成功状态码并且业务维度返回true才成功
	 */
	@ApiField("camp_result")
	private Boolean campResult;

	public void setCampResult(Boolean campResult) {
		this.campResult = campResult;
	}
	public Boolean getCampResult( ) {
		return this.campResult;
	}

}
