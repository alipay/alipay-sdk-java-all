package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PurchaseChargingOption;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.purchase.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:51
 */
public class AlipayAipayNowpayPurchaseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7643522915936632371L;

	/** 
	 * null
	 */
	@ApiListField("charging_option")
	@ApiField("purchase_charging_option")
	private List<PurchaseChargingOption> chargingOption;

	/** 
	 * 链接失效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 购买二维码
	 */
	@ApiField("purchase_qr_code")
	private String purchaseQrCode;

	/** 
	 * 托管购买页
	 */
	@ApiField("purchase_url")
	private String purchaseUrl;

	public void setChargingOption(List<PurchaseChargingOption> chargingOption) {
		this.chargingOption = chargingOption;
	}
	public List<PurchaseChargingOption> getChargingOption( ) {
		return this.chargingOption;
	}

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
