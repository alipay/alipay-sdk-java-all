package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 问诊类消息列表
 *
 * @author auto create
 * @since 1.0, 2026-06-05 17:57:54
 */
public class MsgDataParam extends AlipayObject {

	private static final long serialVersionUID = 3173585847777747983L;

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
	 * null
	 */
	@ApiListField("redirect_url_params")
	@ApiField("redirect_url_param")
	private List<RedirectUrlParam> redirectUrlParams;

	/**
	 * null
	 */
	@ApiListField("redirect_urls")
	@ApiField("string")
	private List<String> redirectUrls;

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

	public List<RedirectUrlParam> getRedirectUrlParams() {
		return this.redirectUrlParams;
	}
	public void setRedirectUrlParams(List<RedirectUrlParam> redirectUrlParams) {
		this.redirectUrlParams = redirectUrlParams;
	}

	public List<String> getRedirectUrls() {
		return this.redirectUrls;
	}
	public void setRedirectUrls(List<String> redirectUrls) {
		this.redirectUrls = redirectUrls;
	}

}
