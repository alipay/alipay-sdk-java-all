package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV履约同步的陪诊类对象
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:01:05
 */
public class OfflineEscortFulfillmentDetailData extends AlipayObject {

	private static final long serialVersionUID = 4682977781654636511L;

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
	 * 就诊信息
	 */
	@ApiField("clinic_info")
	private ClinicInfo clinicInfo;

	/**
	 * 关闭原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 关闭备注
	 */
	@ApiField("close_remark")
	private String closeRemark;

	/**
	 * 关闭时间
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 订单完成时间审核通过
	 */
	@ApiField("finish_time")
	private String finishTime;

	/**
	 * 患者信息
	 */
	@ApiField("patient_info")
	private FulfillmentPatientInfo patientInfo;

	/**
	 * 服务安排时间
	 */
	@ApiField("scheduled_time")
	private String scheduledTime;

	/**
	 * 服务结束时间
	 */
	@ApiField("service_end_time")
	private String serviceEndTime;

	/**
	 * 服务结果
	 */
	@ApiField("service_result")
	private ServiceResult serviceResult;

	/**
	 * 陪诊开始时间
	 */
	@ApiField("service_start_time")
	private String serviceStartTime;

	/**
	 * 陪诊人员信息
	 */
	@ApiField("staff_info")
	private FulfillmentStaffInfo staffInfo;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

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

	public ClinicInfo getClinicInfo() {
		return this.clinicInfo;
	}
	public void setClinicInfo(ClinicInfo clinicInfo) {
		this.clinicInfo = clinicInfo;
	}

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getCloseRemark() {
		return this.closeRemark;
	}
	public void setCloseRemark(String closeRemark) {
		this.closeRemark = closeRemark;
	}

	public String getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
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

	public FulfillmentPatientInfo getPatientInfo() {
		return this.patientInfo;
	}
	public void setPatientInfo(FulfillmentPatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public String getScheduledTime() {
		return this.scheduledTime;
	}
	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public String getServiceEndTime() {
		return this.serviceEndTime;
	}
	public void setServiceEndTime(String serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
	}

	public ServiceResult getServiceResult() {
		return this.serviceResult;
	}
	public void setServiceResult(ServiceResult serviceResult) {
		this.serviceResult = serviceResult;
	}

	public String getServiceStartTime() {
		return this.serviceStartTime;
	}
	public void setServiceStartTime(String serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
	}

	public FulfillmentStaffInfo getStaffInfo() {
		return this.staffInfo;
	}
	public void setStaffInfo(FulfillmentStaffInfo staffInfo) {
		this.staffInfo = staffInfo;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
