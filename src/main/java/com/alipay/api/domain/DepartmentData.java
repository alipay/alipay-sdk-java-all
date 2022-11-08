package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 科室数据
 *
 * @author auto create
 * @since 1.0, 2022-06-20 14:30:32
 */
public class DepartmentData extends AlipayObject {

	private static final long serialVersionUID = 7261162165283497528L;

	/**
	 * 呼吸道疾病
	 */
	@ApiField("department_disease_info")
	private String departmentDiseaseInfo;

	/**
	 * 科室id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 科室标签
	 */
	@ApiField("department_tag")
	private String departmentTag;

	/**
	 * 科室类型
	 */
	@ApiField("department_type")
	private String departmentType;

	/**
	 * 科室挂号服务跳转
	 */
	@ApiField("department_url")
	private String departmentUrl;

	/**
	 * 科室所属医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 所属上级科室id
	 */
	@ApiField("parent_department_id")
	private String parentDepartmentId;

	/**
	 * 所属上级科室名称
	 */
	@ApiField("parent_department_name")
	private String parentDepartmentName;

	public String getDepartmentDiseaseInfo() {
		return this.departmentDiseaseInfo;
	}
	public void setDepartmentDiseaseInfo(String departmentDiseaseInfo) {
		this.departmentDiseaseInfo = departmentDiseaseInfo;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentTag() {
		return this.departmentTag;
	}
	public void setDepartmentTag(String departmentTag) {
		this.departmentTag = departmentTag;
	}

	public String getDepartmentType() {
		return this.departmentType;
	}
	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}

	public String getDepartmentUrl() {
		return this.departmentUrl;
	}
	public void setDepartmentUrl(String departmentUrl) {
		this.departmentUrl = departmentUrl;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getParentDepartmentId() {
		return this.parentDepartmentId;
	}
	public void setParentDepartmentId(String parentDepartmentId) {
		this.parentDepartmentId = parentDepartmentId;
	}

	public String getParentDepartmentName() {
		return this.parentDepartmentName;
	}
	public void setParentDepartmentName(String parentDepartmentName) {
		this.parentDepartmentName = parentDepartmentName;
	}

}
