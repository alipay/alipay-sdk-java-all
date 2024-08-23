package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询 AuthAmount返回结果封装
 *
 * @author auto create
 * @since 1.0, 2024-04-11 16:35:49
 */
public class OpenApiAuthAmountInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8244445683392288658L;

	/**
	 * 授权金额信息
	 */
	@ApiListField("amounts")
	@ApiField("open_api_auth_amount_d_t_o")
	private List<OpenApiAuthAmountDTO> amounts;

	/**
	 * 过授权规则包查询，命中的规则编码.
	 */
	@ApiField("rule_code")
	private String ruleCode;

	/**
	 * 通过授权规则包查询，命中的规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	public List<OpenApiAuthAmountDTO> getAmounts() {
		return this.amounts;
	}
	public void setAmounts(List<OpenApiAuthAmountDTO> amounts) {
		this.amounts = amounts;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

}
