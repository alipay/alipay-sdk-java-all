package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.shangou.storeandgoods.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-23 13:42:41
 */
public class AlipayCommerceOperationShangouStoreandgoodsRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7151384448327823747L;

	/** 
	 * 未绑定账号跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/** 
	 * 搜推结果
	 */
	@ApiField("result_data")
	private String resultData;

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	public String getActionUrl( ) {
		return this.actionUrl;
	}

	public void setResultData(String resultData) {
		this.resultData = resultData;
	}
	public String getResultData( ) {
		return this.resultData;
	}

}
