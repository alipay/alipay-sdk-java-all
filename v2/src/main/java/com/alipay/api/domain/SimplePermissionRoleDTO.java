package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权限角色DTO
 *
 * @author auto create
 * @since 1.0, 2022-11-22 15:23:00
 */
public class SimplePermissionRoleDTO extends AlipayObject {

	private static final long serialVersionUID = 7143537997493944147L;

	/**
	 * actorId-否-用户角色对象id，用户表示角色与服务的关联关系-无枚举-被调方提供-无特殊说明
	 */
	@ApiField("actor_id")
	private String actorId;

	/**
	 * actorName-否-表示用户角色对象名称，暂不消费-无枚举-被调方提供-无特殊说明
	 */
	@ApiField("actor_name")
	private String actorName;

	/**
	 * permissionRoleCode-否-代表服务角色，根据服务角色判断权限-无枚举-被调方提供-无特殊说明
	 */
	@ApiField("permission_role_code")
	private String permissionRoleCode;

	/**
	 * permissionRoleName-否-代表服务角色名称-无枚举-被调方提供-无特殊说明
	 */
	@ApiField("permission_role_name")
	private String permissionRoleName;

	/**
	 * permissionRoleType-否-用于标识服务角色类型-无枚举- 被调方提供-无特殊说明
	 */
	@ApiField("permission_role_type")
	private String permissionRoleType;

	public String getActorId() {
		return this.actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return this.actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getPermissionRoleCode() {
		return this.permissionRoleCode;
	}
	public void setPermissionRoleCode(String permissionRoleCode) {
		this.permissionRoleCode = permissionRoleCode;
	}

	public String getPermissionRoleName() {
		return this.permissionRoleName;
	}
	public void setPermissionRoleName(String permissionRoleName) {
		this.permissionRoleName = permissionRoleName;
	}

	public String getPermissionRoleType() {
		return this.permissionRoleType;
	}
	public void setPermissionRoleType(String permissionRoleType) {
		this.permissionRoleType = permissionRoleType;
	}

}
