package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动打卡查询部门列表
 *
 * @author auto create
 * @since 1.0, 2026-08-11 11:47:51
 */
public class AlipayCommerceEducateSportsDepartBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6723298742218729446L;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 父部门code
	 */
	@ApiField("parent_code")
	private String parentCode;

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

}
