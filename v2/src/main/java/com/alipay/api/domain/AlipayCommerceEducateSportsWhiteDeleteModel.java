package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动打卡删除白名单
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:42:48
 */
public class AlipayCommerceEducateSportsWhiteDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2876848535584827345L;

	/**
	 * 学工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 白名单类型
	 */
	@ApiField("white_type")
	private String whiteType;

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getWhiteType() {
		return this.whiteType;
	}
	public void setWhiteType(String whiteType) {
		this.whiteType = whiteType;
	}

}
