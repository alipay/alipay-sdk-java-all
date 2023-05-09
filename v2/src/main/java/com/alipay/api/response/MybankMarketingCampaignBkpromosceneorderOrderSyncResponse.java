package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromosceneorder.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:40:08
 */
public class MybankMarketingCampaignBkpromosceneorderOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2551158411311575585L;

	/** 
	 * 将请求参数中的request_id返回
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
