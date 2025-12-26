package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-15 21:29:22
 */
public class QualificationConsultInfo extends AlipayObject {

	private static final long serialVersionUID = 6131718465876644633L;

	/**
	 * 实体ID
	 */
	@ApiField("entity_id")
	private String entityId;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

}
