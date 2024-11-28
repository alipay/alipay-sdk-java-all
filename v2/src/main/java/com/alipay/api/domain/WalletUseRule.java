package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包使用规则
 *
 * @author auto create
 * @since 1.0, 2024-09-05 16:47:21
 */
public class WalletUseRule extends AlipayObject {

	private static final long serialVersionUID = 3247924887763776357L;

	/**
	 * 在钱包核销时，需要指定核销范围，本字段可通过数组的方式传递商户ID指定商户核销的范围
	 */
	@ApiField("merchant_rule")
	private String merchantRule;

	/**
	 * 核销规则范围
	 */
	@ApiField("rule_define")
	private RuleDefine ruleDefine;

	public String getMerchantRule() {
		return this.merchantRule;
	}
	public void setMerchantRule(String merchantRule) {
		this.merchantRule = merchantRule;
	}

	public RuleDefine getRuleDefine() {
		return this.ruleDefine;
	}
	public void setRuleDefine(RuleDefine ruleDefine) {
		this.ruleDefine = ruleDefine;
	}

}
