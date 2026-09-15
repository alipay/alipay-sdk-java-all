package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChargingOption;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.charge.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:51
 */
public class AlipayAipayNowpayChargeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6356154571357216915L;

	/** 
	 * 最终收费模式
	 */
	@ApiField("billing_mode")
	private String billingMode;

	/** 
	 * 商品状态
	 */
	@ApiField("capability_status")
	private String capabilityStatus;

	/** 
	 * null
	 */
	@ApiListField("charging_options")
	@ApiField("charging_option")
	private List<ChargingOption> chargingOptions;

	/** 
	 * 平台直接使用该地址进入商品管理
	 */
	@ApiField("management_url")
	private String managementUrl;

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
	 * 额度包返回
	 */
	@ApiField("quota_unit")
	private String quotaUnit;

	/** 
	 * 签约结果展示说明
	 */
	@ApiField("reason_message")
	private String reasonMessage;

	/** 
	 * 状态版本
	 */
	@ApiField("status_version")
	private String statusVersion;

	public void setBillingMode(String billingMode) {
		this.billingMode = billingMode;
	}
	public String getBillingMode( ) {
		return this.billingMode;
	}

	public void setCapabilityStatus(String capabilityStatus) {
		this.capabilityStatus = capabilityStatus;
	}
	public String getCapabilityStatus( ) {
		return this.capabilityStatus;
	}

	public void setChargingOptions(List<ChargingOption> chargingOptions) {
		this.chargingOptions = chargingOptions;
	}
	public List<ChargingOption> getChargingOptions( ) {
		return this.chargingOptions;
	}

	public void setManagementUrl(String managementUrl) {
		this.managementUrl = managementUrl;
	}
	public String getManagementUrl( ) {
		return this.managementUrl;
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

	public void setQuotaUnit(String quotaUnit) {
		this.quotaUnit = quotaUnit;
	}
	public String getQuotaUnit( ) {
		return this.quotaUnit;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}
	public String getReasonMessage( ) {
		return this.reasonMessage;
	}

	public void setStatusVersion(String statusVersion) {
		this.statusVersion = statusVersion;
	}
	public String getStatusVersion( ) {
		return this.statusVersion;
	}

}
