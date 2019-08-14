package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分组查询模型
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:01:42
 */
public class QueryGroup extends AlipayObject {

	private static final long serialVersionUID = 1733467451855924137L;

	/**
	 * 分组id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 分组中的圈人规则
	 */
	@ApiListField("label_rule")
	@ApiField("query_complex_label_rule")
	private List<QueryComplexLabelRule> labelRule;

	/**
	 * 用户分组名称
	 */
	@ApiField("name")
	private String name;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<QueryComplexLabelRule> getLabelRule() {
		return this.labelRule;
	}
	public void setLabelRule(List<QueryComplexLabelRule> labelRule) {
		this.labelRule = labelRule;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
