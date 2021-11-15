package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv权限信息
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:28:04
 */
public class BusinessPermission extends AlipayObject {

	private static final long serialVersionUID = 5293476632363974137L;

	/**
	 * 业务隔离字段
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 权限码名称
	 */
	@ApiField("permission_code")
	private String permissionCode;

	/**
	 * 权限码值
	 */
	@ApiField("source_permission_code")
	private String sourcePermissionCode;

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPermissionCode() {
		return this.permissionCode;
	}
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public String getSourcePermissionCode() {
		return this.sourcePermissionCode;
	}
	public void setSourcePermissionCode(String sourcePermissionCode) {
		this.sourcePermissionCode = sourcePermissionCode;
	}

}
