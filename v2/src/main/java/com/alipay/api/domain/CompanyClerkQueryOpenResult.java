package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业员工查询结果
 *
 * @author auto create
 * @since 1.0, 2026-08-04 11:19:22
 */
public class CompanyClerkQueryOpenResult extends AlipayObject {

	private static final long serialVersionUID = 7872148687513461779L;

	/**
	 * 营业员确认链接
	 */
	@ApiField("clerk_auth_url")
	private String clerkAuthUrl;

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

	public String getClerkAuthUrl() {
		return this.clerkAuthUrl;
	}
	public void setClerkAuthUrl(String clerkAuthUrl) {
		this.clerkAuthUrl = clerkAuthUrl;
	}

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
