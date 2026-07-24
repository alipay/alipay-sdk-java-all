package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctorinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-23 16:38:38
 */
public class AlipayCommerceMedicalDoctorinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1823813664572539849L;

	/** 
	 * 获奖情况
	 */
	@ApiField("awards")
	private String awards;

	/** 
	 * 所属部门名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/** 
	 * 个人简介
	 */
	@ApiField("doc_desc")
	private String docDesc;

	/** 
	 * 医生内部id
	 */
	@ApiField("doctor_inner_id")
	private String doctorInnerId;

	/** 
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/** 
	 * 机构名称 医院
	 */
	@ApiField("organization")
	private String organization;

	/** 
	 * 技能描述
	 */
	@ApiField("skilled_desc")
	private String skilledDesc;

	/** 
	 * 职称
	 */
	@ApiField("title")
	private String title;

	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getAwards( ) {
		return this.awards;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentName( ) {
		return this.departmentName;
	}

	public void setDocDesc(String docDesc) {
		this.docDesc = docDesc;
	}
	public String getDocDesc( ) {
		return this.docDesc;
	}

	public void setDoctorInnerId(String doctorInnerId) {
		this.doctorInnerId = doctorInnerId;
	}
	public String getDoctorInnerId( ) {
		return this.doctorInnerId;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorName( ) {
		return this.doctorName;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getOrganization( ) {
		return this.organization;
	}

	public void setSkilledDesc(String skilledDesc) {
		this.skilledDesc = skilledDesc;
	}
	public String getSkilledDesc( ) {
		return this.skilledDesc;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
