package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多云查询海图权限码权限
 *
 * @author auto create
 * @since 1.0, 2025-01-22 12:00:55
 */
public class AnttechOceanbaseObglobalPermissionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4154489768874629558L;

	/**
	 * 权限码
	 */
	@ApiField("permission_code")
	private String permissionCode;

	/**
	 * 员工工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getPermissionCode() {
		return this.permissionCode;
	}
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
