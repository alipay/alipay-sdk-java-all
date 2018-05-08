package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群数量查询
 *
 * @author auto create
 * @since 1.0, 2017-11-10 15:32:41
 */
public class AlipayOpenPublicGroupCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8251939382233459625L;

	/**
	 * 用户分组的规则项列表，规则项之间元素是与的逻辑，每个规则项内部用多个值表示或的逻辑
	 */
	@ApiListField("label_rule")
	@ApiField("complex_label_rule")
	private List<ComplexLabelRule> labelRule;

	public List<ComplexLabelRule> getLabelRule() {
		return this.labelRule;
	}
	public void setLabelRule(List<ComplexLabelRule> labelRule) {
		this.labelRule = labelRule;
	}

}
