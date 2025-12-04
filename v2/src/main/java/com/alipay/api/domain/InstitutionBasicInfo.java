package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制度基本信息
 *
 * @author auto create
 * @since 1.0, 2025-11-11 14:02:24
 */
public class InstitutionBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 4223112718322379194L;

	/**
	 * 费控咨询模式
	 */
	@ApiField("consult_mode")
	private String consultMode;

	/**
	 * 制度可发放资产币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 制度是否启用
	 */
	@ApiField("effective")
	private String effective;

	/**
	 * 制度生效结束时间
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 制度生效起始时间
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 制度描述
	 */
	@ApiField("institution_desc")
	private String institutionDesc;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 制度名称
	 */
	@ApiField("institution_name")
	private String institutionName;

	/**
	 * 制度下额度是否支持多人共享。如果支持，则制度下资产所有人共享；如果不支持，则制度下的资产为个人资产，成员之间不共享。
	 */
	@ApiField("multi_employee_share_mode")
	private String multiEmployeeShareMode;

	public String getConsultMode() {
		return this.consultMode;
	}
	public void setConsultMode(String consultMode) {
		this.consultMode = consultMode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEffective() {
		return this.effective;
	}
	public void setEffective(String effective) {
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

	public String getInstitutionDesc() {
		return this.institutionDesc;
	}
	public void setInstitutionDesc(String institutionDesc) {
		this.institutionDesc = institutionDesc;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getInstitutionName() {
		return this.institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getMultiEmployeeShareMode() {
		return this.multiEmployeeShareMode;
	}
	public void setMultiEmployeeShareMode(String multiEmployeeShareMode) {
		this.multiEmployeeShareMode = multiEmployeeShareMode;
	}

}
