package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信会员产品包定制化配置.仅对product_sku为QX-ZTB-ASSISTANT-STANDARD和QX-TK-ASSISTANT-STANDARD 是生效
 *
 * @author auto create
 * @since 1.0, 2026-04-13 22:17:45
 */
public class EpAssistantProductConfig extends AlipayObject {

	private static final long serialVersionUID = 3395215586441675622L;

	/**
	 * 时长购买数量，是以duration_unit的值作为单位，例如3个 HALF_YEAR表示一年半
	 */
	@ApiField("duration_quantity")
	private Long durationQuantity;

	/**
	 * 购买会员包的时长单位(目前支持HALF_YEAR和YEAR两个选项)，生效与本结构的购买数量(duration_quantity)结合使用，如购买3个HALF_YEAR表示一年半。
	 */
	@ApiField("duration_unit")
	private String durationUnit;

	/**
	 * 购买的license数量，总量不多于300
	 */
	@ApiField("license_num")
	private Long licenseNum;

	public Long getDurationQuantity() {
		return this.durationQuantity;
	}
	public void setDurationQuantity(Long durationQuantity) {
		this.durationQuantity = durationQuantity;
	}

	public String getDurationUnit() {
		return this.durationUnit;
	}
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public Long getLicenseNum() {
		return this.licenseNum;
	}
	public void setLicenseNum(Long licenseNum) {
		this.licenseNum = licenseNum;
	}

}
