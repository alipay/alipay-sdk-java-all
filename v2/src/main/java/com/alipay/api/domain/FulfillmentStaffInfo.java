package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 陪诊人员信息
 *
 * @author auto create
 * @since 1.0, 2026-05-15 14:52:45
 */
public class FulfillmentStaffInfo extends AlipayObject {

	private static final long serialVersionUID = 7161517463316433655L;

	/**
	 * 所属部门
	 */
	@ApiField("department")
	private String department;

	/**
	 * 所属机构/医院
	 */
	@ApiField("organization")
	private String organization;

	/**
	 * 脱敏显示：139****5678
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 累计服务单数
	 */
	@ApiField("service_count")
	private Long serviceCount;

	/**
	 * 陪诊员姓名
	 */
	@ApiField("staff_name")
	private String staffName;

	/**
	 * 职称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 工作年限
	 */
	@ApiField("work_years")
	private Long workYears;

	/**
	 * 工作年限
	 */
	@ApiField("work_years_text")
	private String workYearsText;

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getOrganization() {
		return this.organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getServiceCount() {
		return this.serviceCount;
	}
	public void setServiceCount(Long serviceCount) {
		this.serviceCount = serviceCount;
	}

	public String getStaffName() {
		return this.staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getWorkYears() {
		return this.workYears;
	}
	public void setWorkYears(Long workYears) {
		this.workYears = workYears;
	}

	public String getWorkYearsText() {
		return this.workYearsText;
	}
	public void setWorkYearsText(String workYearsText) {
		this.workYearsText = workYearsText;
	}

}
