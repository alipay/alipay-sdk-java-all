package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:37:41
 */
public class InpatientRecord extends AlipayObject {

	private static final long serialVersionUID = 1535839859623813417L;

	/**
	 * 数据唯一标识，用于去重
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 实际住院天数
	 */
	@ApiField("days")
	private String days;

	/**
	 * 入院科室
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 出院时间
	 */
	@ApiField("discharge_date")
	private String dischargeDate;

	/**
	 * 就诊医院
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 入院时间
	 */
	@ApiField("in_date")
	private String inDate;

	/**
	 * 出院时间 当前字段已废弃(字段类型更改， 最新使用改为使用discharge_date的字段)
	 */
	@ApiField("recovery_date")
	@Deprecated
	private Date recoveryDate;

	/**
	 * 出院科室
	 */
	@ApiField("recovery_department_name")
	private String recoveryDepartmentName;

	/**
	 * 出院主要诊断
	 */
	@ApiField("recovery_memo")
	private String recoveryMemo;

	/**
	 * 手术信息
	 */
	@ApiField("surgery_info")
	private SurgeryInfo surgeryInfo;

	/**
	 * 出院诊断-中医病名名称
	 */
	@ApiField("traditional_chinese_medicine_diagnosis")
	private String traditionalChineseMedicineDiagnosis;

	/**
	 * 入院途径、入院诊断名称
	 */
	@ApiField("way")
	private String way;

	/**
	 * 出院诊断-西医诊断名称
	 */
	@ApiField("western_medicine_diagnosis")
	private String westernMedicineDiagnosis;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDays() {
		return this.days;
	}
	public void setDays(String days) {
		this.days = days;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDischargeDate() {
		return this.dischargeDate;
	}
	public void setDischargeDate(String dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getInDate() {
		return this.inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public Date getRecoveryDate() {
		return this.recoveryDate;
	}
	public void setRecoveryDate(Date recoveryDate) {
		this.recoveryDate = recoveryDate;
	}

	public String getRecoveryDepartmentName() {
		return this.recoveryDepartmentName;
	}
	public void setRecoveryDepartmentName(String recoveryDepartmentName) {
		this.recoveryDepartmentName = recoveryDepartmentName;
	}

	public String getRecoveryMemo() {
		return this.recoveryMemo;
	}
	public void setRecoveryMemo(String recoveryMemo) {
		this.recoveryMemo = recoveryMemo;
	}

	public SurgeryInfo getSurgeryInfo() {
		return this.surgeryInfo;
	}
	public void setSurgeryInfo(SurgeryInfo surgeryInfo) {
		this.surgeryInfo = surgeryInfo;
	}

	public String getTraditionalChineseMedicineDiagnosis() {
		return this.traditionalChineseMedicineDiagnosis;
	}
	public void setTraditionalChineseMedicineDiagnosis(String traditionalChineseMedicineDiagnosis) {
		this.traditionalChineseMedicineDiagnosis = traditionalChineseMedicineDiagnosis;
	}

	public String getWay() {
		return this.way;
	}
	public void setWay(String way) {
		this.way = way;
	}

	public String getWesternMedicineDiagnosis() {
		return this.westernMedicineDiagnosis;
	}
	public void setWesternMedicineDiagnosis(String westernMedicineDiagnosis) {
		this.westernMedicineDiagnosis = westernMedicineDiagnosis;
	}

}
