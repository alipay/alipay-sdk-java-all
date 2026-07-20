package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 挂号绿通
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:54:22
 */
public class RegistrationGreenChannelFulfillmentDetailData extends AlipayObject {

	private static final long serialVersionUID = 7732479999432698116L;

	/**
	 * 就医信息
	 */
	@ApiField("actual_visit_info")
	private ActualVisitInfo actualVisitInfo;

	/**
	 * 就诊信息
	 */
	@ApiField("clinic_info")
	private ClinicInfo clinicInfo;

	/**
	 * 确认时间
	 */
	@ApiField("confirmed_time")
	private String confirmedTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 订单完成时间(审核通过)
	 */
	@ApiField("finish_time")
	private String finishTime;

	/**
	 * 材料信息
	 */
	@ApiField("material_info")
	private FulfillmentMaterialInfo materialInfo;

	/**
	 * 患者信息
	 */
	@ApiField("patient_info")
	private FulfillmentPatientInfo patientInfo;

	/**
	 * 接单时间
	 */
	@ApiField("processed_time")
	private String processedTime;

	/**
	 * 预约成功时间
	 */
	@ApiField("reserved_time")
	private String reservedTime;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

	public ActualVisitInfo getActualVisitInfo() {
		return this.actualVisitInfo;
	}
	public void setActualVisitInfo(ActualVisitInfo actualVisitInfo) {
		this.actualVisitInfo = actualVisitInfo;
	}

	public ClinicInfo getClinicInfo() {
		return this.clinicInfo;
	}
	public void setClinicInfo(ClinicInfo clinicInfo) {
		this.clinicInfo = clinicInfo;
	}

	public String getConfirmedTime() {
		return this.confirmedTime;
	}
	public void setConfirmedTime(String confirmedTime) {
		this.confirmedTime = confirmedTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public FulfillmentMaterialInfo getMaterialInfo() {
		return this.materialInfo;
	}
	public void setMaterialInfo(FulfillmentMaterialInfo materialInfo) {
		this.materialInfo = materialInfo;
	}

	public FulfillmentPatientInfo getPatientInfo() {
		return this.patientInfo;
	}
	public void setPatientInfo(FulfillmentPatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public String getProcessedTime() {
		return this.processedTime;
	}
	public void setProcessedTime(String processedTime) {
		this.processedTime = processedTime;
	}

	public String getReservedTime() {
		return this.reservedTime;
	}
	public void setReservedTime(String reservedTime) {
		this.reservedTime = reservedTime;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
