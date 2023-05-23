package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制度基本信息
 *
 * @author auto create
 * @since 1.0, 2023-05-08 20:15:53
 */
public class InstitutionBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 6286851594862982898L;

	/**
	 * 费控咨询模式
	 */
	@ApiField("consult_mode")
	private String consultMode;

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

	public String getConsultMode() {
		return this.consultMode;
	}
	public void setConsultMode(String consultMode) {
		this.consultMode = consultMode;
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

}
