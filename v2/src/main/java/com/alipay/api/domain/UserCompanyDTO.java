package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户所属企业
 *
 * @author auto create
 * @since 1.0, 2023-06-20 10:26:55
 */
public class UserCompanyDTO extends AlipayObject {

	private static final long serialVersionUID = 7155624241861775129L;

	/**
	 * 实体id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 实体名称
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 工单权限
	 */
	@ApiField("work_order_permission")
	private Boolean workOrderPermission;

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

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public Boolean getWorkOrderPermission() {
		return this.workOrderPermission;
	}
	public void setWorkOrderPermission(Boolean workOrderPermission) {
		this.workOrderPermission = workOrderPermission;
	}

}
