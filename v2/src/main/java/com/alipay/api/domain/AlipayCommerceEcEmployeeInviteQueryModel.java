package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取员工邀请链接
 *
 * @author auto create
 * @since 1.0, 2023-08-11 11:14:07
 */
public class AlipayCommerceEcEmployeeInviteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7219329783539779231L;

	/**
	 * 企业码员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 页面内容code
	 */
	@ApiField("page_content_code")
	private String pageContentCode;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPageContentCode() {
		return this.pageContentCode;
	}
	public void setPageContentCode(String pageContentCode) {
		this.pageContentCode = pageContentCode;
	}

}
