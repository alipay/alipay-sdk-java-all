package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 筛选项
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:03:58
 */
public class FilterItem extends AlipayObject {

	private static final long serialVersionUID = 3739934945554493658L;

	/**
	 * 平台科室id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 排班日期，格式: MM-dd
	 */
	@ApiField("schedule_date")
	private String scheduleDate;

	/**
	 * 灵知院区医院id
	 */
	@ApiField("sub_hospital_uniq_code")
	private String subHospitalUniqCode;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getScheduleDate() {
		return this.scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getSubHospitalUniqCode() {
		return this.subHospitalUniqCode;
	}
	public void setSubHospitalUniqCode(String subHospitalUniqCode) {
		this.subHospitalUniqCode = subHospitalUniqCode;
	}

}
