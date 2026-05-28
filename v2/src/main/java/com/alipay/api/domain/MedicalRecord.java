package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 就医记录详情
 *
 * @author auto create
 * @since 1.0, 2026-05-26 19:48:44
 */
public class MedicalRecord extends AlipayObject {

	private static final long serialVersionUID = 2195139632833985232L;

	/**
	 * 就诊日期,格式：yyyy-MM-dd
	 */
	@ApiField("md_date")
	private String mdDate;

	/**
	 * 挂号流水号,同就诊id
	 */
	@ApiField("mdtrt_id")
	private String mdtrtId;

	/**
	 * 结算类型
	 */
	@ApiField("med_type")
	private String medType;

	/**
	 * 院区id
	 */
	@ApiField("medical_org_campus_id")
	private String medicalOrgCampusId;

	/**
	 * 医疗机构ID
	 */
	@ApiField("medical_org_id")
	private String medicalOrgId;

	public String getMdDate() {
		return this.mdDate;
	}
	public void setMdDate(String mdDate) {
		this.mdDate = mdDate;
	}

	public String getMdtrtId() {
		return this.mdtrtId;
	}
	public void setMdtrtId(String mdtrtId) {
		this.mdtrtId = mdtrtId;
	}

	public String getMedType() {
		return this.medType;
	}
	public void setMedType(String medType) {
		this.medType = medType;
	}

	public String getMedicalOrgCampusId() {
		return this.medicalOrgCampusId;
	}
	public void setMedicalOrgCampusId(String medicalOrgCampusId) {
		this.medicalOrgCampusId = medicalOrgCampusId;
	}

	public String getMedicalOrgId() {
		return this.medicalOrgId;
	}
	public void setMedicalOrgId(String medicalOrgId) {
		this.medicalOrgId = medicalOrgId;
	}

}
