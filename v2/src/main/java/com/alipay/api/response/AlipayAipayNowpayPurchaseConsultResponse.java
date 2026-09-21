package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConsultChargingOption;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.purchase.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 20:12:53
 */
public class AlipayAipayNowpayPurchaseConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4769621911144275655L;

	/** 
	 * 收费能力状态
	 */
	@ApiField("capability_status")
	private String capabilityStatus;

	/** 
	 * null
	 */
	@ApiListField("charging_options")
	@ApiField("consult_charging_option")
	private List<ConsultChargingOption> chargingOptions;

	/** 
	 * 决策结果
	 */
	@ApiField("decision")
	private String decision;

	/** 
	 * 商品图标
	 */
	@ApiField("product_icon_url")
	private String productIconUrl;

	/** 
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/** 
	 * 购买二维码
	 */
	@ApiField("purchase_qr_code")
	private String purchaseQrCode;

	/** 
	 * 购买链接
	 */
	@ApiField("purchase_url")
	private String purchaseUrl;

	/** 
	 * DENY 时原因
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/** 
	 * 表示本次有效权益的生效时间
	 */
	@ApiField("valid_from")
	private String validFrom;

	/** 
	 * 表示本次有效权益的结束时间
	 */
	@ApiField("valid_until")
	private String validUntil;

	public void setCapabilityStatus(String capabilityStatus) {
		this.capabilityStatus = capabilityStatus;
	}
	public String getCapabilityStatus( ) {
		return this.capabilityStatus;
	}

	public void setChargingOptions(List<ConsultChargingOption> chargingOptions) {
		this.chargingOptions = chargingOptions;
	}
	public List<ConsultChargingOption> getChargingOptions( ) {
		return this.chargingOptions;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getDecision( ) {
		return this.decision;
	}

	public void setProductIconUrl(String productIconUrl) {
		this.productIconUrl = productIconUrl;
	}
	public String getProductIconUrl( ) {
		return this.productIconUrl;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName( ) {
		return this.productName;
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

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReasonCode( ) {
		return this.reasonCode;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getValidFrom( ) {
		return this.validFrom;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}
	public String getValidUntil( ) {
		return this.validUntil;
	}

}
