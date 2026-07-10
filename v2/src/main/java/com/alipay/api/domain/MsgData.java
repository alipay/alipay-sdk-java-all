package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息列表
 *
 * @author auto create
 * @since 1.0, 2026-06-09 13:49:35
 */
public class MsgData extends AlipayObject {

	private static final long serialVersionUID = 7871919957356863235L;

	/**
	 * 问诊订单ID
	 */
	@ApiField("consultation_order_id")
	private String consultationOrderId;

	/**
	 * 问诊时间
	 */
	@ApiField("consultation_time")
	private String consultationTime;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 接诊医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 简介
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 外部商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 最新会话时间
	 */
	@ApiField("latest_conversation_time")
	private String latestConversationTime;

	/**
	 * 最新消息内容
	 */
	@ApiField("latest_msg_content")
	private String latestMsgContent;

	/**
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 消息时间
	 */
	@ApiField("msg_time")
	private String msgTime;

	/**
	 * 消息类型
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 患者ID
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 跳转URL对象列表
	 */
	@ApiField("redirect_url_params")
	private RedirectUrlParam redirectUrlParams;

	/**
	 * 服务包过期时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("service_end_time")
	private String serviceEndTime;

	/**
	 * 服务包ID
	 */
	@ApiField("service_package_id")
	private String servicePackageId;

	/**
	 * 服务包名称
	 */
	@ApiField("service_package_name")
	private String servicePackageName;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getConsultationOrderId() {
		return this.consultationOrderId;
	}
	public void setConsultationOrderId(String consultationOrderId) {
		this.consultationOrderId = consultationOrderId;
	}

	public String getConsultationTime() {
		return this.consultationTime;
	}
	public void setConsultationTime(String consultationTime) {
		this.consultationTime = consultationTime;
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

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getLatestConversationTime() {
		return this.latestConversationTime;
	}
	public void setLatestConversationTime(String latestConversationTime) {
		this.latestConversationTime = latestConversationTime;
	}

	public String getLatestMsgContent() {
		return this.latestMsgContent;
	}
	public void setLatestMsgContent(String latestMsgContent) {
		this.latestMsgContent = latestMsgContent;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgTime() {
		return this.msgTime;
	}
	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public RedirectUrlParam getRedirectUrlParams() {
		return this.redirectUrlParams;
	}
	public void setRedirectUrlParams(RedirectUrlParam redirectUrlParams) {
		this.redirectUrlParams = redirectUrlParams;
	}

	public String getServiceEndTime() {
		return this.serviceEndTime;
	}
	public void setServiceEndTime(String serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
	}

	public String getServicePackageId() {
		return this.servicePackageId;
	}
	public void setServicePackageId(String servicePackageId) {
		this.servicePackageId = servicePackageId;
	}

	public String getServicePackageName() {
		return this.servicePackageName;
	}
	public void setServicePackageName(String servicePackageName) {
		this.servicePackageName = servicePackageName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
