package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpaydirect.purchase.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-25 14:47:53
 */
public class AlipayAipayNowpaydirectPurchaseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6768818674396421289L;

	/** 
	 * 链接失效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 购买二维码，用于pc端直接展示二维码后扫码购买
	 */
	@ApiField("purchase_qr_code")
	private String purchaseQrCode;

	/** 
	 * 购买链接地址，用于手机端直接跳转购买
	 */
	@ApiField("purchase_url")
	private String purchaseUrl;

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setPurchaseQrCode(String purchaseQrCode) {
		this.purchaseQrCode = purchaseQrCode;
	}
	public String getPurchaseQrCode( ) {
		return this.purchaseQrCode;
	}

	public void setPurchaseUrl(String purchaseUrl) {
		this.purchaseUrl = purchaseUrl;
	}
	public String getPurchaseUrl( ) {
		return this.purchaseUrl;
	}

}
