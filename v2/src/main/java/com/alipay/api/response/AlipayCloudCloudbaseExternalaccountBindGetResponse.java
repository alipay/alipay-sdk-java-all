package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.externalaccount.bind.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 13:46:52
 */
public class AlipayCloudCloudbaseExternalaccountBindGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5639775691269495168L;

	/** 
	 * 生成的小程序accessToken
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 生成的小程序ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/** 
	 * 影子钱包ID
	 */
	@ApiField("shadow_wallet_id")
	private String shadowWalletId;

	/** 
	 * 绑定状态
 - BIND_OK
 - UNBIND_OK
 - BIND_FAILED
 - UNBIND_FAILED
	 */
	@ApiField("status")
	private String status;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}
	public String getBizAppId( ) {
		return this.bizAppId;
	}

	public void setShadowWalletId(String shadowWalletId) {
		this.shadowWalletId = shadowWalletId;
	}
	public String getShadowWalletId( ) {
		return this.shadowWalletId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
