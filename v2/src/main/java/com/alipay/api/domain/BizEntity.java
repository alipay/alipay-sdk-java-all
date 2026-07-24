package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-26 21:27:47
 */
public class BizEntity extends AlipayObject {

	private static final long serialVersionUID = 4767992559234514889L;

	/**
	 * 实体类型id，从前面会话中获取
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
