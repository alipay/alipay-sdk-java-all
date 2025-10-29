package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.companyclerk.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-18 14:32:40
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyclerkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7573672573411467771L;

	/** 
	 * 员工名称
	 */
	@ApiField("clerk_name")
	private String clerkName;

	/** 
	 * 员工手机号
	 */
	@ApiField("clerk_phone")
	private Long clerkPhone;

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

	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}
	public String getClerkName( ) {
		return this.clerkName;
	}

	public void setClerkPhone(Long clerkPhone) {
		this.clerkPhone = clerkPhone;
	}
	public Long getClerkPhone( ) {
		return this.clerkPhone;
	}

	public void setClerkRole(String clerkRole) {
		this.clerkRole = clerkRole;
	}
	public String getClerkRole( ) {
		return this.clerkRole;
	}

	public void setClerkStatus(String clerkStatus) {
		this.clerkStatus = clerkStatus;
	}
	public String getClerkStatus( ) {
		return this.clerkStatus;
	}

	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}
	public String getCompanyClerkId( ) {
		return this.companyClerkId;
	}

	public void setOutClerkId(String outClerkId) {
		this.outClerkId = outClerkId;
	}
	public String getOutClerkId( ) {
		return this.outClerkId;
	}

}
