package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益信息
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:05:11
 */
public class BenefitInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 7399669236948812991L;

	/**
	 * PRE_FUND：实际核销或者商户赠送的金额
DISCOUNT：实际折扣掉的金额（获取权益不支持该类型）
COUPON：实际核销或者商户赠送的券
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 权益类型
PRE_FUND（卡面额）
DISCOUNT：折扣金额
COUPON：券
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * COUPON：当核销或者赠送券时，可以设置该值
	 */
	@ApiField("count")
	private String count;

	/**
	 * 产生核销或者赠送权益的描述
	 */
	@ApiField("description")
	private String description;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
