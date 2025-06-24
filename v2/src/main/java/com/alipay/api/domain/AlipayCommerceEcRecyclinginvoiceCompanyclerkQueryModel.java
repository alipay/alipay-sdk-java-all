package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业营业员查询
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:20:57
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyclerkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1513685637585762246L;

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
	 * 外部营业员ID
	 */
	@ApiField("out_clerk_id")
	private String outClerkId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

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

	public String getOutClerkId() {
		return this.outClerkId;
	}
	public void setOutClerkId(String outClerkId) {
		this.outClerkId = outClerkId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
