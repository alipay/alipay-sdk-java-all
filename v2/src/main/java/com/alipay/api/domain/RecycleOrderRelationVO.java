package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联关系
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:31:37
 */
public class RecycleOrderRelationVO extends AlipayObject {

	private static final long serialVersionUID = 3717737849978284282L;

	/**
	 * 关联描述
	 */
	@ApiField("relation_desc")
	private String relationDesc;

	/**
	 * 关联编号，如租赁订单号
	 */
	@ApiField("relation_id")
	private String relationId;

	/**
	 * 关联关系类型
	 */
	@ApiField("relation_type")
	private String relationType;

	public String getRelationDesc() {
		return this.relationDesc;
	}
	public void setRelationDesc(String relationDesc) {
		this.relationDesc = relationDesc;
	}

	public String getRelationId() {
		return this.relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

}
