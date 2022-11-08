package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实体类型
 *
 * @author auto create
 * @since 1.0, 2021-12-22 17:28:08
 */
public class NewsNerEntity extends AlipayObject {

	private static final long serialVersionUID = 5277869132722798518L;

	/**
	 * 实体名称
	 */
	@ApiField("entity")
	private String entity;

	/**
	 * 实体类型，cows公司，ppws个人，ogws机构
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 分类权重
	 */
	@ApiField("weight")
	private String weight;

	public String getEntity() {
		return this.entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
