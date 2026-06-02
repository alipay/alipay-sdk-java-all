package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-22 14:17:48
 */
public class BizEntityId extends AlipayObject {

	private static final long serialVersionUID = 1473713247582957635L;

	/**
	 * 实体id，通过查询房源信息得到房源ID，订单信息得到订单ID
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 实体类型
	 */
	@ApiField("entity_type")
	private String entityType;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

}
