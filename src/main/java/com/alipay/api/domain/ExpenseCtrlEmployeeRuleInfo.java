package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工绑定费控规则结构
 *
 * @author auto create
 * @since 1.0, 2022-01-07 15:45:43
 */
public class ExpenseCtrlEmployeeRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 6521831887472453968L;

	/**
	 * 费控规则状态，1表示有效，0表示无效
	 */
	@ApiField("effective")
	private Long effective;

	/**
	 * 费控规则有效期截止
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 费控规则有效期起始
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 费控规则作用范围，
EMPLOYEE表示员工，ENTERPRISE表示企业
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 费控规则ID
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 费控规则名称
	 */
	@ApiField("standard_name")
	private String standardName;

	public Long getEffective() {
		return this.effective;
	}
	public void setEffective(Long effective) {
		this.effective = effective;
	}

	public Date getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStandardName() {
		return this.standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

}
