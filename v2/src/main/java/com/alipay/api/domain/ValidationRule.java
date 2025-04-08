package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 输入域规则校验模型
 *
 * @author auto create
 * @since 1.0, 2024-06-18 20:20:49
 */
public class ValidationRule extends AlipayObject {

	private static final long serialVersionUID = 5561698922255795145L;

	/**
	 * 0-不支持费控，1-支持费控
	 */
	@ApiField("cons_type")
	private String consType;

	/**
	 * 规则校验对应的错误提示 如：户号必须为10位数字
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 最小金额， 单位元
	 */
	@ApiField("min_amount")
	private String minAmount;

	/**
	 * 正则表达式规则 如十位数字的正则表达式为：^\d{10}$
	 */
	@ApiField("rule_text")
	private String ruleText;

	/**
	 * 复杂类型校验-vObj
正则类型-regexp
	 */
	@ApiField("rule_type")
	private String ruleType;

	public String getConsType() {
		return this.consType;
	}
	public void setConsType(String consType) {
		this.consType = consType;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getMinAmount() {
		return this.minAmount;
	}
	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}

	public String getRuleText() {
		return this.ruleText;
	}
	public void setRuleText(String ruleText) {
		this.ruleText = ruleText;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

}
