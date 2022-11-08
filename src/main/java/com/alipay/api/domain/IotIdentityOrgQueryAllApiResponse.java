package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构全部查询响应，没有组件信息
 *
 * @author auto create
 * @since 1.0, 2022-01-22 14:14:44
 */
public class IotIdentityOrgQueryAllApiResponse extends AlipayObject {

	private static final long serialVersionUID = 1334279552824979179L;

	/**
	 * 签约主体外标id，机构或机构集id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 签约主体名称
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 签约主体类型，1机构2机构集
	 */
	@ApiField("entity_type")
	private Long entityType;

	/**
	 * 人脸库id
	 */
	@ApiField("group_id")
	private String groupId;

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

	public Long getEntityType() {
		return this.entityType;
	}
	public void setEntityType(Long entityType) {
		this.entityType = entityType;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
