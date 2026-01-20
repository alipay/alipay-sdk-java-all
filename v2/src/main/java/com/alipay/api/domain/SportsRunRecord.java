package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-19 15:17:43
 */
public class SportsRunRecord extends AlipayObject {

	private static final long serialVersionUID = 4598691893362842543L;

	/**
	 * 部门名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 学生学号或教师职工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 跑步结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 跑步记录达标标识
	 */
	@ApiField("is_valid")
	private Long isValid;

	/**
	 * 跑步记录状态中文描述
	 */
	@ApiField("is_valid_name")
	private String isValidName;

	/**
	 * 跑步记录未达标原因
	 */
	@ApiField("mark")
	private String mark;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 跑步记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 本次跑步距离，单位公里
	 */
	@ApiField("run_distance")
	private String runDistance;

	/**
	 * 本次跑步持续时长，单位分钟
	 */
	@ApiField("run_duration")
	private String runDuration;

	/**
	 * 本次跑步平均配速，单位分钟/公里
	 */
	@ApiField("run_speed")
	private String runSpeed;

	/**
	 * 跑步开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 本次跑步平均步频，单位步数/分钟
	 */
	@ApiField("step_frequency")
	private String stepFrequency;

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}

	public String getIsValidName() {
		return this.isValidName;
	}
	public void setIsValidName(String isValidName) {
		this.isValidName = isValidName;
	}

	public String getMark() {
		return this.mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRunDistance() {
		return this.runDistance;
	}
	public void setRunDistance(String runDistance) {
		this.runDistance = runDistance;
	}

	public String getRunDuration() {
		return this.runDuration;
	}
	public void setRunDuration(String runDuration) {
		this.runDuration = runDuration;
	}

	public String getRunSpeed() {
		return this.runSpeed;
	}
	public void setRunSpeed(String runSpeed) {
		this.runSpeed = runSpeed;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStepFrequency() {
		return this.stepFrequency;
	}
	public void setStepFrequency(String stepFrequency) {
		this.stepFrequency = stepFrequency;
	}

}
