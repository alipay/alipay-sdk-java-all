package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单变更同步域内互联网医院平台
 *
 * @author auto create
 * @since 1.0, 2026-09-18 20:17:56
 */
public class AlipayCommerceMedicalHyInquiryorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2221767435191444966L;

	/**
	 * 医生语音总结（音频文件链接）
	 */
	@ApiField("doctor_audio_summary")
	private String doctorAudioSummary;

	/**
	 * 医生接诊时间
	 */
	@ApiField("gmt_adoption")
	private Date gmtAdoption;

	/**
	 * 问诊服务结束时间
	 */
	@ApiField("gmt_finished")
	private Date gmtFinished;

	/**
	 * 域内问诊订单唯一标识，用户告诉域内操作的是哪一笔订单
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 医生端系统内部变更状态的时间
	 */
	@ApiField("order_modify_time")
	private Date orderModifyTime;

	/**
	 * 外部isv侧医生的ID，注意要和医生基础数据同步的ID保持一致
	 */
	@ApiField("out_doctor_id")
	private String outDoctorId;

	/**
	 * 极速问诊医生接单后同步过来
	 */
	@ApiField("out_medical_rel_id")
	private String outMedicalRelId;

	/**
	 * 问诊平台编码，由支付宝侧统一分配
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 服务预计结束时间
	 */
	@ApiField("service_expect_end_time")
	private String serviceExpectEndTime;

	/**
	 * 医生端操作订单状态发生变更后，对应状态映射此字段同步到域内
	 */
	@ApiField("status")
	private String status;

	/**
	 * 补充说明状态变更原因
	 */
	@ApiField("status_change_desc")
	private String statusChangeDesc;

	/**
	 * 当问诊订单状态是取消时，用户标识具体的取消类型
	 */
	@ApiField("sub_status")
	private String subStatus;

	public String getDoctorAudioSummary() {
		return this.doctorAudioSummary;
	}
	public void setDoctorAudioSummary(String doctorAudioSummary) {
		this.doctorAudioSummary = doctorAudioSummary;
	}

	public Date getGmtAdoption() {
		return this.gmtAdoption;
	}
	public void setGmtAdoption(Date gmtAdoption) {
		this.gmtAdoption = gmtAdoption;
	}

	public Date getGmtFinished() {
		return this.gmtFinished;
	}
	public void setGmtFinished(Date gmtFinished) {
		this.gmtFinished = gmtFinished;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getOrderModifyTime() {
		return this.orderModifyTime;
	}
	public void setOrderModifyTime(Date orderModifyTime) {
		this.orderModifyTime = orderModifyTime;
	}

	public String getOutDoctorId() {
		return this.outDoctorId;
	}
	public void setOutDoctorId(String outDoctorId) {
		this.outDoctorId = outDoctorId;
	}

	public String getOutMedicalRelId() {
		return this.outMedicalRelId;
	}
	public void setOutMedicalRelId(String outMedicalRelId) {
		this.outMedicalRelId = outMedicalRelId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getServiceExpectEndTime() {
		return this.serviceExpectEndTime;
	}
	public void setServiceExpectEndTime(String serviceExpectEndTime) {
		this.serviceExpectEndTime = serviceExpectEndTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusChangeDesc() {
		return this.statusChangeDesc;
	}
	public void setStatusChangeDesc(String statusChangeDesc) {
		this.statusChangeDesc = statusChangeDesc;
	}

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

}
