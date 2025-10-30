package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromoguardbase.lmitemdelete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:01:57
 */
public class MybankMarketingCampaignBkpromoguardbaseLmitemdeleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7254781996578185895L;

	/** 
	 * request_id + 唯一 + LinkedMall商品删除同步场景 +返回请求中的服务标识
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
