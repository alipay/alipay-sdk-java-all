package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反向企业营业员创建
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:19:58
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyclerkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4536115734521674679L;

	/**
	 * 员工名称，新增开票员时以乐企可信开票员信息为准
	 */
	@ApiField("clerk_name")
	private String clerkName;

	/**
	 * 开票人身份标识
	 */
	@ApiField("clerk_no")
	private String clerkNo;

	/**
	 * 员工权限
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
	 * 员工角色
	 */
	@ApiField("clerk_role")
	private String clerkRole;

	/**
	 * 外部营业员ID，用于唯一标识外部系统中的员工信息。该ID与外部系统的员工一一对应，确保数据的准确性和一致性。
	 */
	@ApiField("out_clerk_id")
	private String outClerkId;

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

	public String getClerkRole() {
		return this.clerkRole;
	}
	public void setClerkRole(String clerkRole) {
		this.clerkRole = clerkRole;
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
