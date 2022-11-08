package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 逻辑组取值规则DTO
 *
 * @author auto create
 * @since 1.0, 2022-05-20 16:41:44
 */
public class LogicalRuleGroupDTO extends AlipayObject {

	private static final long serialVersionUID = 5769688244365761739L;

	/**
	 * 逻辑规则+不唯一
	 */
	@ApiListField("logical_rules")
	@ApiField("logical_rule_item_d_t_o")
	private List<LogicalRuleItemDTO> logicalRules;

	public List<LogicalRuleItemDTO> getLogicalRules() {
		return this.logicalRules;
	}
	public void setLogicalRules(List<LogicalRuleItemDTO> logicalRules) {
		this.logicalRules = logicalRules;
	}

}
