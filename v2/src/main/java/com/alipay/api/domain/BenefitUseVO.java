package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class BenefitUseVO extends AlipayObject {

	private static final long serialVersionUID = 3871443424177517931L;

	/**
	 * 优惠金额
	 */
	@ApiField("amount")
	private MultiCurrencyMoneyDTO amount;

	/**
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益类型，来自 consult 返回的 benefitType
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 资产扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	public MultiCurrencyMoneyDTO getAmount() {
		return this.amount;
	}
	public void setAmount(MultiCurrencyMoneyDTO amount) {
		this.amount = amount;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

}
