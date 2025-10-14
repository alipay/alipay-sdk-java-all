package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.authorize.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-02 14:37:05
 */
public class AlipayFundScenepayAuthorizeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8779374628447469954L;

	/** 
	 * 授权申请凭证
	 */
	@ApiField("apply_token")
	private String applyToken;

	/** 
	 * 签约跳转URL，使用此URL跳转至支付宝端内完成签约
	 */
	@ApiField("apply_url")
	private String applyUrl;

	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}
	public String getApplyToken( ) {
		return this.applyToken;
	}

	public void setApplyUrl(String applyUrl) {
		this.applyUrl = applyUrl;
	}
	public String getApplyUrl( ) {
		return this.applyUrl;
	}

}
