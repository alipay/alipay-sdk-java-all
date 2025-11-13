package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromoguardbase.lmitemmodify.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:26:46
 */
public class MybankMarketingCampaignBkpromoguardbaseLmitemmodifySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8374684417475868728L;

	/** 
	 * request_id + 唯一 + LinkedMall商品修改同步场景 +返回请求中的服务标识
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
