package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 每一项规则校验结果
 *
 * @author auto create
 * @since 1.0, 2023-01-05 21:18:28
 */
public class AccessCheckItemInfo extends AlipayObject {

	private static final long serialVersionUID = 2356578773448985759L;

	/**
	 * 校验结果
	 */
	@ApiField("access_check")
	private Boolean accessCheck;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 错误提示文案
	 */
	@ApiField("tips")
	private String tips;

	public Boolean getAccessCheck() {
		return this.accessCheck;
	}
	public void setAccessCheck(Boolean accessCheck) {
		this.accessCheck = accessCheck;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

}
