package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前置筛选配置
 *
 * @author auto create
 * @since 1.0, 2025-09-05 16:57:38
 */
public class LegacyPreFilterDetail extends AlipayObject {

	private static final long serialVersionUID = 3142768894282833966L;

	/**
	 * 各条检索条件之间的关系
	 */
	@ApiField("expression_relationship")
	private String expressionRelationship;

	/**
	 * 检索字段之间的关系
	 */
	@ApiField("relationship")
	private String relationship;

	/**
	 * 被检索列名
	 */
	@ApiField("retrieved_column_name")
	private String retrievedColumnName;

	/**
	 * 筛选值配置
	 */
	@ApiField("values")
	private LegacyPreFilterValueDetail values;

	public String getExpressionRelationship() {
		return this.expressionRelationship;
	}
	public void setExpressionRelationship(String expressionRelationship) {
		this.expressionRelationship = expressionRelationship;
	}

	public String getRelationship() {
		return this.relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getRetrievedColumnName() {
		return this.retrievedColumnName;
	}
	public void setRetrievedColumnName(String retrievedColumnName) {
		this.retrievedColumnName = retrievedColumnName;
	}

	public LegacyPreFilterValueDetail getValues() {
		return this.values;
	}
	public void setValues(LegacyPreFilterValueDetail values) {
		this.values = values;
	}

}
