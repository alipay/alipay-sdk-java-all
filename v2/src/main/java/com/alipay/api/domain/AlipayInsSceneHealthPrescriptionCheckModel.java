package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 处方合理性校验接口
 *
 * @author auto create
 * @since 1.0, 2023-08-02 15:12:06
 */
public class AlipayInsSceneHealthPrescriptionCheckModel extends AlipayObject {

	private static final long serialVersionUID = 3635966167682849443L;

	/**
	 * 蚂蚁合约单号
	 */
	@ApiField("ant_ser_contract_no")
	private String antSerContractNo;

	/**
	 * 问诊结论（结构化处方）
	 */
	@ApiField("diagnosis")
	private Diagnosis diagnosis;

	/**
	 * 问诊对话
	 */
	@ApiListField("dialogue_process")
	@ApiField("dialogue_process")
	private List<DialogueProcess> dialogueProcess;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	public String getAntSerContractNo() {
		return this.antSerContractNo;
	}
	public void setAntSerContractNo(String antSerContractNo) {
		this.antSerContractNo = antSerContractNo;
	}

	public Diagnosis getDiagnosis() {
		return this.diagnosis;
	}
	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	public List<DialogueProcess> getDialogueProcess() {
		return this.dialogueProcess;
	}
	public void setDialogueProcess(List<DialogueProcess> dialogueProcess) {
		this.dialogueProcess = dialogueProcess;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

}
