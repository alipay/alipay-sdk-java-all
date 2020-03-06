package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.commonevent.apply response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-28 09:30:06
 */
public class AlipayMarketingCampaignCommoneventApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5671125112517862128L;

	/** 
	 * 与event关联的返回结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
