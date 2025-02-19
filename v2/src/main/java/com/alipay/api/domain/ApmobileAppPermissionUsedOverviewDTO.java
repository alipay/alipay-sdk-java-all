package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端权限检测报告-敏感权限使用总览DTO
 *
 * @author auto create
 * @since 1.0, 2023-06-29 18:07:33
 */
public class ApmobileAppPermissionUsedOverviewDTO extends AlipayObject {

	private static final long serialVersionUID = 3235152682457484527L;

	/**
	 * 权限码
	 */
	@ApiField("permission_code")
	private String permissionCode;

	/**
	 * 权限名称
	 */
	@ApiField("permission_name")
	private String permissionName;

	/**
	 * 权限使用类型
	 */
	@ApiField("permission_type")
	private String permissionType;

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

	public String getPermissionType() {
		return this.permissionType;
	}
	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}

}
