package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.auth.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-24 10:32:23
 */
public class AlipayOfflineProviderCollaborateAuthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8723817929392987714L;

	/** 
	 * 申请授权的二维码链接，需要将该链接生成二维码引导被授权人（即签约卖进方案的用户）进行扫码，扫码后将会引导向smid的法人或联系人申请设备绑定授权。
	 */
	@ApiField("apply_auth_url")
	private String applyAuthUrl;

	/** 
	 * 授权申请单ID，可以使用该ID查询授权申请单状态
	 */
	@ApiField("auth_order_id")
	private String authOrderId;

	public void setApplyAuthUrl(String applyAuthUrl) {
		this.applyAuthUrl = applyAuthUrl;
	}
	public String getApplyAuthUrl( ) {
		return this.applyAuthUrl;
	}

	public void setAuthOrderId(String authOrderId) {
		this.authOrderId = authOrderId;
	}
	public String getAuthOrderId( ) {
		return this.authOrderId;
	}

}
