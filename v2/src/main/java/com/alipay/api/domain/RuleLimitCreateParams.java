package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 规则创建参数
 *
 * @author auto create
 * @since 1.0, 2023-08-07 10:33:12
 */
public class RuleLimitCreateParams extends AlipayObject {

	private static final long serialVersionUID = 3733643631559962363L;

	/**
	 * 规则内容集合
	 */
	@ApiListField("limit_list")
	@ApiField("rule_limit_content")
	private List<RuleLimitContent> limitList;

	/**
	 * 限制规则类型，ALL:全场门店有效，SHOP_LIMIT: 部分门店有效
	 */
	@ApiField("rule_type")
	private String ruleType;

	public List<RuleLimitContent> getLimitList() {
		return this.limitList;
	}
	public void setLimitList(List<RuleLimitContent> limitList) {
		this.limitList = limitList;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

}
