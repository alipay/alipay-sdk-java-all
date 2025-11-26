package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通行证角色信息DTO
 *
 * @author auto create
 * @since 1.0, 2025-11-06 15:34:06
 */
public class OBPassportEntityDTO extends AlipayObject {

	private static final long serialVersionUID = 5859387119265578463L;

	/**
	 * 自然实体名称
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 个人:INDIVIDUAL
企业:COMPANY
机构:INSTITUTION
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 通行证ID
	 */
	@ApiField("passport_id")
	private String passportId;

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
