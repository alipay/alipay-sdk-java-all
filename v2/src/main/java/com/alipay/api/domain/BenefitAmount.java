package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠的金额
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:31
 */
public class BenefitAmount extends AlipayObject {

	private static final long serialVersionUID = 7578885294166819456L;

	/**
	 * 优惠的名称
	 */
	@ApiField("benefit_desc")
	private String benefitDesc;

	/**
	 * 辅营带来的收益的金额
	 */
	@ApiField("benefit_money")
	private String benefitMoney;

	/**
	 * ● CASH_BACK：返现
● CUT：立减
● COUPON：优惠券
	 */
	@ApiField("type")
	private String type;

	public String getBenefitDesc() {
		return this.benefitDesc;
	}
	public void setBenefitDesc(String benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	public String getBenefitMoney() {
		return this.benefitMoney;
	}
	public void setBenefitMoney(String benefitMoney) {
		this.benefitMoney = benefitMoney;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
