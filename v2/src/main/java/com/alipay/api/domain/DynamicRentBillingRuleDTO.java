package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动态租金计费规则
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:46
 */
public class DynamicRentBillingRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 5772434554279218326L;

	/**
	 * 多阶段必填
	 */
	@ApiField("multi_stage")
	private DynamicRentBillingRuleMultiStageDTO multiStage;

	/**
	 * 单阶段必填
	 */
	@ApiField("single_stage")
	private DynamicRentBillingRuleSingleStageDTO singleStage;

	/**
	 * 多阶段:MULTI_STAGE
单阶段:SINGLE_STAGE
	 */
	@ApiField("type")
	private String type;

	public DynamicRentBillingRuleMultiStageDTO getMultiStage() {
		return this.multiStage;
	}
	public void setMultiStage(DynamicRentBillingRuleMultiStageDTO multiStage) {
		this.multiStage = multiStage;
	}

	public DynamicRentBillingRuleSingleStageDTO getSingleStage() {
		return this.singleStage;
	}
	public void setSingleStage(DynamicRentBillingRuleSingleStageDTO singleStage) {
		this.singleStage = singleStage;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
