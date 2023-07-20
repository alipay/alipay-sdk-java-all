package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromoguardbase.lmitemmodify.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:06:50
 */
public class MybankMarketingCampaignBkpromoguardbaseLmitemmodifySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6547626613445367582L;

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
