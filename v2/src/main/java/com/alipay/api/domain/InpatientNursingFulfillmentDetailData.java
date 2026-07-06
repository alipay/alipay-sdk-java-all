package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 陪护数据
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:01:05
 */
public class InpatientNursingFulfillmentDetailData extends AlipayObject {

	private static final long serialVersionUID = 4764658291453299893L;

	/**
	 * 到达时间
	 */
	@ApiField("arrival_time")
	private String arrivalTime;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 取消备注
	 */
	@ApiField("cancel_remark")
	private String cancelRemark;

	/**
	 * 取消时间
	 */
	@ApiField("cancel_time")
	private String cancelTime;

	/**
	 * 住院信息
	 */
	@ApiField("care_info")
	private CareInfo careInfo;

	/**
	 * 2023-10-26 16:00:00
	 */
	@ApiField("completion_time")
	private String completionTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 离开时间
	 */
	@ApiField("departure_time")
	private String departureTime;

	/**
	 * 订单完成时间审核通过
	 */
	@ApiField("finish_time")
	private String finishTime;

	/**
	 * 患者信息
	 */
	@ApiField("patient_info")
	private InpatientNursingPatientInfo patientInfo;

	/**
	 * 服务结果
	 */
	@ApiField("service_result")
	private InpatientNursingServiceResult serviceResult;

	/**
	 * 人员信息
	 */
	@ApiField("staff_info")
	private InpatientNursingStaffInfo staffInfo;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

	public String getArrivalTime() {
		return this.arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCancelRemark() {
		return this.cancelRemark;
	}
	public void setCancelRemark(String cancelRemark) {
		this.cancelRemark = cancelRemark;
	}

	public String getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	public CareInfo getCareInfo() {
		return this.careInfo;
	}
	public void setCareInfo(CareInfo careInfo) {
		this.careInfo = careInfo;
	}

	public String getCompletionTime() {
		return this.completionTime;
	}
	public void setCompletionTime(String completionTime) {
		this.completionTime = completionTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public InpatientNursingPatientInfo getPatientInfo() {
		return this.patientInfo;
	}
	public void setPatientInfo(InpatientNursingPatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public InpatientNursingServiceResult getServiceResult() {
		return this.serviceResult;
	}
	public void setServiceResult(InpatientNursingServiceResult serviceResult) {
		this.serviceResult = serviceResult;
	}

	public InpatientNursingStaffInfo getStaffInfo() {
		return this.staffInfo;
	}
	public void setStaffInfo(InpatientNursingStaffInfo staffInfo) {
		this.staffInfo = staffInfo;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
