package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业员工查询结果
 *
 * @author auto create
 * @since 1.0, 2026-03-24 10:23:09
 */
public class CompanyClerkQueryOpenResult extends AlipayObject {

	private static final long serialVersionUID = 1549329577325977732L;

	/**
	 * 员工名称
	 */
	@ApiField("clerk_name")
	private String clerkName;

	/**
	 * 员工手机号
	 */
	@ApiField("clerk_phone")
	private String clerkPhone;

	/**
	 * 员工角色
	 */
	@ApiField("clerk_role")
	private String clerkRole;

	/**
	 * 营业员状态
	 */
	@ApiField("clerk_status")
	private String clerkStatus;

	/**
	 * 企业（商户）营业员ID
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/**
	 * 外部营业员ID
	 */
	@ApiField("out_clerk_id")
	private String outClerkId;

	public String getClerkName() {
		return this.clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getClerkPhone() {
		return this.clerkPhone;
	}
	public void setClerkPhone(String clerkPhone) {
		this.clerkPhone = clerkPhone;
	}

	public String getClerkRole() {
		return this.clerkRole;
	}
	public void setClerkRole(String clerkRole) {
		this.clerkRole = clerkRole;
	}

	public String getClerkStatus() {
		return this.clerkStatus;
	}
	public void setClerkStatus(String clerkStatus) {
		this.clerkStatus = clerkStatus;
	}

	public String getCompanyClerkId() {
		return this.companyClerkId;
	}
	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}

	public String getOutClerkId() {
		return this.outClerkId;
	}
	public void setOutClerkId(String outClerkId) {
		this.outClerkId = outClerkId;
	}

}
