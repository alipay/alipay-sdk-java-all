package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权限DTO
 *
 * @author auto create
 * @since 1.0, 2022-11-22 15:23:00
 */
public class PermissionDTO extends AlipayObject {

	private static final long serialVersionUID = 7863177883641397778L;

	/**
	 * businessId-唯一-权限所属服务id，表示权限服务关系-无枚举-被调方结果返回-无特殊说明
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * businessName-否-权限所属服务名称-无枚举-被调方结果返回-无特殊说明
	 */
	@ApiField("business_name")
	private String businessName;

	/**
	 * permissionCode-否-权限代码-枚举：spfin.usercore.update.operator-被调方结果返回-无特殊说明
	 */
	@ApiField("permission_code")
	private String permissionCode;

	/**
	 * permissionName-否-权限名称-无枚举-被调方结果返回-无特殊说明
	 */
	@ApiField("permission_name")
	private String permissionName;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return this.businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getPermissionCode() {
		return this.permissionCode;
	}
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public String getPermissionName() {
		return this.permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

}
