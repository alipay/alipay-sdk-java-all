package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约受限信息
 *
 * @author auto create
 * @since 1.0, 2021-04-22 14:39:41
 */
public class SignRestrictInfo extends AlipayObject {

	private static final long serialVersionUID = 6125295739696759336L;

	/**
	 * 产品码，支付宝定义的产品码
	 */
	@ApiField("restrict_product")
	private String restrictProduct;

	/**
	 * 受限的原因
	 */
	@ApiField("restrict_reason")
	private String restrictReason;

	/**
	 * 受限原因编码
	 */
	@ApiField("restrict_reason_code")
	private String restrictReasonCode;

	/**
	 * 受限版本，02-受限版 04-极速版
	 */
	@ApiField("restrict_version")
	private String restrictVersion;

	public String getRestrictProduct() {
		return this.restrictProduct;
	}
	public void setRestrictProduct(String restrictProduct) {
		this.restrictProduct = restrictProduct;
	}

	public String getRestrictReason() {
		return this.restrictReason;
	}
	public void setRestrictReason(String restrictReason) {
		this.restrictReason = restrictReason;
	}

	public String getRestrictReasonCode() {
		return this.restrictReasonCode;
	}
	public void setRestrictReasonCode(String restrictReasonCode) {
		this.restrictReasonCode = restrictReasonCode;
	}

	public String getRestrictVersion() {
		return this.restrictVersion;
	}
	public void setRestrictVersion(String restrictVersion) {
		this.restrictVersion = restrictVersion;
	}

}
