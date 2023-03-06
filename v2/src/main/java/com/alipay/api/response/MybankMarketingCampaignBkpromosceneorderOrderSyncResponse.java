package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromosceneorder.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:40:51
 */
public class MybankMarketingCampaignBkpromosceneorderOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8879561376715616919L;

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
