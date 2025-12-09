package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.card.activateurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:22:40
 */
public class AlipayUserCardActivateurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6196368474529591884L;

	/** 
	 * 会员卡领卡链接(使用时需URLDecode解码)。商户获取此链接后可投放到服务窗消息、店铺二维码等。
	 */
	@ApiField("apply_card_url")
	private String applyCardUrl;

	/** 
	 * 会员卡开卡表单提交后回调地址
	 */
	@ApiField("callback")
	private String callback;

	public void setApplyCardUrl(String applyCardUrl) {
		this.applyCardUrl = applyCardUrl;
	}
	public String getApplyCardUrl( ) {
		return this.applyCardUrl;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}
	public String getCallback( ) {
		return this.callback;
	}

}
