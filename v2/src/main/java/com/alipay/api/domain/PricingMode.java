package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:51
 */
public class PricingMode extends AlipayObject {

	private static final long serialVersionUID = 6186789226426741914L;

	/**
	 * 计费模式
	 */
	@ApiField("billing_mode")
	private String billingMode;

	/**
	 * 初始化时可为空，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * QUANTITY 必填：COUNT/POINT
	 */
	@ApiField("quota_unit")
	private String quotaUnit;

	public String getBillingMode() {
		return this.billingMode;
	}
	public void setBillingMode(String billingMode) {
		this.billingMode = billingMode;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuotaUnit() {
		return this.quotaUnit;
	}
	public void setQuotaUnit(String quotaUnit) {
		this.quotaUnit = quotaUnit;
	}

}
