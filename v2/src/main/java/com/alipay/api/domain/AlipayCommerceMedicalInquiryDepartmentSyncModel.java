package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互联网医院科室基础数据同步
 *
 * @author auto create
 * @since 1.0, 2026-08-24 20:57:47
 */
public class AlipayCommerceMedicalInquiryDepartmentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3145642156214279747L;

	/**
	 * 科室地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 年龄限制（0：无限制；1:14 周岁以上；2:18 周岁以上）
	 */
	@ApiField("age_restriction")
	private String ageRestriction;

	/**
	 * 数据版本号（毫秒级时间戳）
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 三方科室编码
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 三方科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 状态 (ONLINE/OFFLINE)
	 */
	@ApiField("department_status")
	private String departmentStatus;

	/**
	 * 科室联系电话
	 */
	@ApiField("dept_phone")
	private String deptPhone;

	/**
	 * 科室排序值
	 */
	@ApiField("dept_sort")
	private String deptSort;

	/**
	 * 科室特色描述
	 */
	@ApiField("dept_special")
	private String deptSpecial;

	/**
	 * 科室介绍说明
	 */
	@ApiField("description")
	private String description;

	/**
	 * 性别限制（0：无限制；1：男性；2：女性）
	 */
	@ApiField("gender_restriction")
	private String genderRestriction;

	/**
	 * 三方医院编码
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 科室层级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 科室人数
	 */
	@ApiField("member_count")
	private String memberCount;

	/**
	 * 上级科室编码
	 */
	@ApiField("parent_department_id")
	private String parentDepartmentId;

	/**
	 * 父科室名称
	 */
	@ApiField("parent_dept_name")
	private String parentDeptName;

	/**
	 * 来源平台 code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 科室简称
	 */
	@ApiField("short_name")
	private String shortName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAgeRestriction() {
		return this.ageRestriction;
	}
	public void setAgeRestriction(String ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
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

	public String getDepartmentStatus() {
		return this.departmentStatus;
	}
	public void setDepartmentStatus(String departmentStatus) {
		this.departmentStatus = departmentStatus;
	}

	public String getDeptPhone() {
		return this.deptPhone;
	}
	public void setDeptPhone(String deptPhone) {
		this.deptPhone = deptPhone;
	}

	public String getDeptSort() {
		return this.deptSort;
	}
	public void setDeptSort(String deptSort) {
		this.deptSort = deptSort;
	}

	public String getDeptSpecial() {
		return this.deptSpecial;
	}
	public void setDeptSpecial(String deptSpecial) {
		this.deptSpecial = deptSpecial;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenderRestriction() {
		return this.genderRestriction;
	}
	public void setGenderRestriction(String genderRestriction) {
		this.genderRestriction = genderRestriction;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getMemberCount() {
		return this.memberCount;
	}
	public void setMemberCount(String memberCount) {
		this.memberCount = memberCount;
	}

	public String getParentDepartmentId() {
		return this.parentDepartmentId;
	}
	public void setParentDepartmentId(String parentDepartmentId) {
		this.parentDepartmentId = parentDepartmentId;
	}

	public String getParentDeptName() {
		return this.parentDeptName;
	}
	public void setParentDeptName(String parentDeptName) {
		this.parentDeptName = parentDeptName;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
