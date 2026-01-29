package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反向企业营业员变更
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:19:53
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyclerkModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2246822546379259135L;

	/**
	 * 员工名称
	 */
	@ApiField("clerk_name")
	private String clerkName;

	/**
	 * 开票人身份标识
	 */
	@ApiField("clerk_no")
	private String clerkNo;

	/**
	 * 修改员工权限（全量更新）
	 */
	@ApiListField("clerk_permit_list")
	@ApiField("string")
	private List<String> clerkPermitList;

	/**
	 * 员工手机号
	 */
	@ApiField("clerk_phone")
	private String clerkPhone;

	/**
	 * 企业（商户）营业员ID
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getClerkName() {
		return this.clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getClerkNo() {
		return this.clerkNo;
	}
	public void setClerkNo(String clerkNo) {
		this.clerkNo = clerkNo;
	}

	public List<String> getClerkPermitList() {
		return this.clerkPermitList;
	}
	public void setClerkPermitList(List<String> clerkPermitList) {
		this.clerkPermitList = clerkPermitList;
	}

	public String getClerkPhone() {
		return this.clerkPhone;
	}
	public void setClerkPhone(String clerkPhone) {
		this.clerkPhone = clerkPhone;
	}

	public String getCompanyClerkId() {
		return this.companyClerkId;
	}
	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
