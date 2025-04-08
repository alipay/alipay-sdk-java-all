package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠数据
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:33
 */
public class Discount extends AlipayObject {

	private static final long serialVersionUID = 6427563927321162751L;

	/**
	 * 金额收益列表
	 */
	@ApiListField("benefit_amounts")
	@ApiField("benefit_amount")
	private List<BenefitAmount> benefitAmounts;

	/**
	 * 辅营/返现/立减/优惠带来的优惠金额的tag（名称），能给对应的优惠产生关联
	 */
	@ApiField("benefit_desc")
	private String benefitDesc;

	/**
	 * 如优惠券，就是优惠券的金额
	 */
	@ApiField("benefit_money")
	private String benefitMoney;

	/**
	 * 辅营带来的服务
	 */
	@ApiListField("benefit_service")
	@ApiField("benefit")
	private List<Benefit> benefitService;

	/**
	 * 用户优惠需要付出的金钱数量
	 */
	@ApiField("cost")
	private String cost;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 如果是返现，领取规则要在这个描述里面，对应用户需要进行的操作，如「落地后领取10元优惠券」
	 */
	@ApiField("rule_desc")
	private String ruleDesc;

	/**
	 * ● AUXILIARY_BUSINESS：辅营
● CASH_BACK：返现
● CUT：立减
● COUPON：优惠券
	 */
	@ApiField("type")
	private String type;

	public List<BenefitAmount> getBenefitAmounts() {
		return this.benefitAmounts;
	}
	public void setBenefitAmounts(List<BenefitAmount> benefitAmounts) {
		this.benefitAmounts = benefitAmounts;
	}

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

	public List<Benefit> getBenefitService() {
		return this.benefitService;
	}
	public void setBenefitService(List<Benefit> benefitService) {
		this.benefitService = benefitService;
	}

	public String getCost() {
		return this.cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}
	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
