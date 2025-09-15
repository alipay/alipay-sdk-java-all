package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 使用规则
 *
 * @author auto create
 * @since 1.0, 2025-07-04 11:57:36
 */
public class RuleDefine extends AlipayObject {

	private static final long serialVersionUID = 5668675361689713121L;

	/**
	 * bizTid范围
	 */
	@ApiListField("biz_tids")
	@ApiField("string")
	private List<String> bizTids;

	/**
	 * 实体条件
	 */
	@ApiField("entity_condition")
	private String entityCondition;

	/**
	 * 实体值
	 */
	@ApiListField("entity_values")
	@ApiField("string")
	private List<String> entityValues;

	public List<String> getBizTids() {
		return this.bizTids;
	}
	public void setBizTids(List<String> bizTids) {
		this.bizTids = bizTids;
	}

	public String getEntityCondition() {
		return this.entityCondition;
	}
	public void setEntityCondition(String entityCondition) {
		this.entityCondition = entityCondition;
	}

	public List<String> getEntityValues() {
		return this.entityValues;
	}
	public void setEntityValues(List<String> entityValues) {
		this.entityValues = entityValues;
	}

}
