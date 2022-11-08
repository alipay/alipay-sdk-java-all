package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 规则查询结果
 *
 * @author auto create
 * @since 1.0, 2022-04-13 10:45:08
 */
public class RuleQueryResult extends AlipayObject {

	private static final long serialVersionUID = 6512897963172564273L;

	/**
	 * 规则详情信息
	 */
	@ApiListField("rule_info_list")
	@ApiField("rule_info")
	private List<RuleInfo> ruleInfoList;

	public List<RuleInfo> getRuleInfoList() {
		return this.ruleInfoList;
	}
	public void setRuleInfoList(List<RuleInfo> ruleInfoList) {
		this.ruleInfoList = ruleInfoList;
	}

}
