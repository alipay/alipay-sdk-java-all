package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签组取值规则DTO
 *
 * @author auto create
 * @since 1.0, 2022-05-23 15:20:17
 */
public class TagRuleGroupDTO extends AlipayObject {

	private static final long serialVersionUID = 4311711476646979697L;

	/**
	 * 标签取值列表+不唯一
	 */
	@ApiListField("rule_items")
	@ApiField("tag_rule_item_d_t_o")
	private List<TagRuleItemDTO> ruleItems;

	public List<TagRuleItemDTO> getRuleItems() {
		return this.ruleItems;
	}
	public void setRuleItems(List<TagRuleItemDTO> ruleItems) {
		this.ruleItems = ruleItems;
	}

}
