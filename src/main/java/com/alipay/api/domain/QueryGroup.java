package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分组查询模型
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:08:15
 */
public class QueryGroup extends AlipayObject {

	private static final long serialVersionUID = 5815828548735585229L;

	/**
	 * 人群中包含人数
	 */
	@ApiField("count")
	private Long count;

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

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

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
