package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OB个人信息
 *
 * @author auto create
 * @since 1.0, 2024-01-02 19:45:41
 */
public class OBPersonalDTO extends AlipayObject {

	private static final long serialVersionUID = 1558296336776655366L;

	/**
	 * 个人实体id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 个人实体名称
	 */
	@ApiField("entity_name")
	private String entityName;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

}
