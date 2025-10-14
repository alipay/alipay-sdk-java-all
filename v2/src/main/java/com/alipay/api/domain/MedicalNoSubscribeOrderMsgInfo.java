package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查单详情
 *
 * @author auto create
 * @since 1.0, 2024-05-20 11:49:08
 */
public class MedicalNoSubscribeOrderMsgInfo extends AlipayObject {

	private static final long serialVersionUID = 7745481454343463847L;

	/**
	 * 检查项目
	 */
	@ApiField("check_item")
	private String checkItem;

	/**
	 * 实际检查时间
	 */
	@ApiField("check_time")
	private String checkTime;

	/**
	 * 检查时间段
	 */
	@ApiField("check_time_slot")
	private String checkTimeSlot;

	/**
	 * 当前叫号
	 */
	@ApiField("current_num")
	private String currentNum;

	/**
	 * 科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 科室为准
	 */
	@ApiField("dept_loc")
	private String deptLoc;

	/**
	 * 医院名称
	 */
	@ApiField("hospital")
	private String hospital;

	/**
	 * 就诊序号
	 */
	@ApiField("medical_num")
	private String medicalNum;

	/**
	 * 订单详情链接，三方小程序的服务直达链接
	 */
	@ApiField("merchant_order_link_page")
	private String merchantOrderLinkPage;

	/**
	 * 调用方自定义浮层链接
	 */
	@ApiField("msg_popup_url")
	private String msgPopupUrl;

	/**
	 * 就诊人
	 */
	@ApiField("patient")
	private String patient;

	/**
	 * 订单实际支付金额（元，两位小数）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单实际退款金额（元，两位小数）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 预约时间
	 */
	@ApiField("scheduled_time")
	private String scheduledTime;

	/**
	 * 预约时段
	 */
	@ApiField("scheduled_time_slot")
	private String scheduledTimeSlot;

	/**
	 * 温馨提示，文本类型，最长200个中文字
	 */
	@ApiField("summary_tip")
	private String summaryTip;

	/**
	 * 订单待支付金额（元，两位小数）
	 */
	@ApiField("wait_pay_amount")
	private String waitPayAmount;

	public String getCheckItem() {
		return this.checkItem;
	}
	public void setCheckItem(String checkItem) {
		this.checkItem = checkItem;
	}

	public String getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckTimeSlot() {
		return this.checkTimeSlot;
	}
	public void setCheckTimeSlot(String checkTimeSlot) {
		this.checkTimeSlot = checkTimeSlot;
	}

	public String getCurrentNum() {
		return this.currentNum;
	}
	public void setCurrentNum(String currentNum) {
		this.currentNum = currentNum;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDeptLoc() {
		return this.deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	public String getHospital() {
		return this.hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getMedicalNum() {
		return this.medicalNum;
	}
	public void setMedicalNum(String medicalNum) {
		this.medicalNum = medicalNum;
	}

	public String getMerchantOrderLinkPage() {
		return this.merchantOrderLinkPage;
	}
	public void setMerchantOrderLinkPage(String merchantOrderLinkPage) {
		this.merchantOrderLinkPage = merchantOrderLinkPage;
	}

	public String getMsgPopupUrl() {
		return this.msgPopupUrl;
	}
	public void setMsgPopupUrl(String msgPopupUrl) {
		this.msgPopupUrl = msgPopupUrl;
	}

	public String getPatient() {
		return this.patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getScheduledTime() {
		return this.scheduledTime;
	}
	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public String getScheduledTimeSlot() {
		return this.scheduledTimeSlot;
	}
	public void setScheduledTimeSlot(String scheduledTimeSlot) {
		this.scheduledTimeSlot = scheduledTimeSlot;
	}

	public String getSummaryTip() {
		return this.summaryTip;
	}
	public void setSummaryTip(String summaryTip) {
		this.summaryTip = summaryTip;
	}

	public String getWaitPayAmount() {
		return this.waitPayAmount;
	}
	public void setWaitPayAmount(String waitPayAmount) {
		this.waitPayAmount = waitPayAmount;
	}

}
