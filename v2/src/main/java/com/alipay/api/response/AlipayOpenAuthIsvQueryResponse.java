package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.isv.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 14:16:04
 */
public class AlipayOpenAuthIsvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1772474569968929741L;

	/** 
	 * 脱敏后的授权商户的支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/** 
	 * 授权商户应用的应用id
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/** 
	 * 授权商户应用的应用名称
	 */
	@ApiField("merchant_app_name")
	private String merchantAppName;

	/** 
	 * 脱敏后的授权商户的名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}
	public String getAlipayAccount( ) {
		return this.alipayAccount;
	}

	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}
	public String getMerchantAppId( ) {
		return this.merchantAppId;
	}

	public void setMerchantAppName(String merchantAppName) {
		this.merchantAppName = merchantAppName;
	}
	public String getMerchantAppName( ) {
		return this.merchantAppName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

}
