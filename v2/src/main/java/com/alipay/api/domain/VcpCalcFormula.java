package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 计算公式
 *
 * @author auto create
 * @since 1.0, 2022-11-14 19:27:06
 */
public class VcpCalcFormula extends AlipayObject {

	private static final long serialVersionUID = 5622253275514215215L;

	/**
	 * 优惠基础个数
	 */
	@ApiField("base_count")
	private Long baseCount;

	/**
	 * 封顶次数
	 */
	@ApiField("max_count")
	private Long maxCount;

	/**
	 * 优惠金额
	 */
	@ApiField("reduction_amount")
	private String reductionAmount;

	/**
	 * 优惠比率
	 */
	@ApiField("reduction_ratio")
	private String reductionRatio;

	/**
	 * 随机立减优惠计算，每一条规则 包含最小优惠，最大优惠，这条规则的设置占比（所有占比相加为100%）
	 */
	@ApiListField("rnd_benefit_rules")
	@ApiField("rnd_benefit_rule")
	private List<RndBenefitRule> rndBenefitRules;

	/**
	 * 取整模式
	 */
	@ApiField("rounding_mode")
	private String roundingMode;

	/**
	 * 指定金额
	 */
	@ApiField("specified_amount")
	private String specifiedAmount;

	public Long getBaseCount() {
		return this.baseCount;
	}
	public void setBaseCount(Long baseCount) {
		this.baseCount = baseCount;
	}

	public Long getMaxCount() {
		return this.maxCount;
	}
	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}

	public String getReductionAmount() {
		return this.reductionAmount;
	}
	public void setReductionAmount(String reductionAmount) {
		this.reductionAmount = reductionAmount;
	}

	public String getReductionRatio() {
		return this.reductionRatio;
	}
	public void setReductionRatio(String reductionRatio) {
		this.reductionRatio = reductionRatio;
	}

	public List<RndBenefitRule> getRndBenefitRules() {
		return this.rndBenefitRules;
	}
	public void setRndBenefitRules(List<RndBenefitRule> rndBenefitRules) {
		this.rndBenefitRules = rndBenefitRules;
	}

	public String getRoundingMode() {
		return this.roundingMode;
	}
	public void setRoundingMode(String roundingMode) {
		this.roundingMode = roundingMode;
	}

	public String getSpecifiedAmount() {
		return this.specifiedAmount;
	}
	public void setSpecifiedAmount(String specifiedAmount) {
		this.specifiedAmount = specifiedAmount;
	}

}
