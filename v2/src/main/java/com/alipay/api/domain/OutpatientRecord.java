package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class OutpatientRecord extends AlipayObject {

	private static final long serialVersionUID = 6635727382913325619L;

	/**
	 * 病人主诉
	 */
	@ApiField("complaint")
	private String complaint;

	/**
	 * 数据唯一标识，用于去重，下同
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 就诊日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 就诊科室
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 就诊医院
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 现病史
	 */
	@ApiField("illness_history")
	private String illnessHistory;

	/**
	 * 体格检查
	 */
	@ApiField("physical_exam")
	private String physicalExam;

	/**
	 * 诊断*<中医诊断OR西医诊断疾病名称>
	 */
	@ApiField("result")
	private String result;

	/**
	 * 处理及意见
	 */
	@ApiField("treatment_advice")
	private String treatmentAdvice;

	/**
	 * 门诊类型 中医（CM）/西医（WM）
	 */
	@ApiField("type")
	private String type;

	public String getComplaint() {
		return this.complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getIllnessHistory() {
		return this.illnessHistory;
	}
	public void setIllnessHistory(String illnessHistory) {
		this.illnessHistory = illnessHistory;
	}

	public String getPhysicalExam() {
		return this.physicalExam;
	}
	public void setPhysicalExam(String physicalExam) {
		this.physicalExam = physicalExam;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getTreatmentAdvice() {
		return this.treatmentAdvice;
	}
	public void setTreatmentAdvice(String treatmentAdvice) {
		this.treatmentAdvice = treatmentAdvice;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
