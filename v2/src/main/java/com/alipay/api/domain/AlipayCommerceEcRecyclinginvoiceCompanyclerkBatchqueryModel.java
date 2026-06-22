package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业营业员批量查询
 *
 * @author auto create
 * @since 1.0, 2026-04-27 18:00:02
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyclerkBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6183831423959362999L;

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
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示数据的条数
	 */
	@ApiField("page_size")
	private Long pageSize;

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

	public String getClerkRole() {
		return this.clerkRole;
	}
	public void setClerkRole(String clerkRole) {
		this.clerkRole = clerkRole;
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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
