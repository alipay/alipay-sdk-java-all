package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钉钉消息通知
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:27:31
 */
public class AlipayCommerceMedicalEbbenefitDingmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 5745925226863255831L;

	/**
	 * 消息类型（好大夫这边自定义，方便后续识别特定消息做特殊处理）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 息参数
	 */
	@ApiField("data")
	private RemindVO data;

	/**
	 * 会员id
	 */
	@ApiField("eb_user_id")
	private String ebUserId;

	/**
	 * 服务类型 
图文问诊:IMAGE_INQUIRY
电话问诊:PHONE_INQUIRY
视频问诊:VIDEO_INQUIRY
快速图文:QUICK_IMAGE_INQUIRY
快速电话:QUICK_PHONE_INQUIRY
快速视频:QUICK_VIDEO_INQUIRY
互联网门诊（电话）:
INTERNET_CLINIC_PHONE
互联网门诊（视频）:
INTERNET_CLINIC_VIDEO
门诊安排：CLINIC_ARRANGEMENT
住院安排：HOSPITALIZATION_ARRANGEMENTS
	 */
	@ApiField("inquiry_mode")
	private String inquiryMode;

	/**
	 * 跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 消息创建时间
	 */
	@ApiField("msg_time")
	private Date msgTime;

	/**
	 * 消息类型 提醒消息  REMIND
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 订单id（好大夫不传）
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单类型  
专家问诊:SPECIALIST_CONSULTATION
体检解读:HEALTH_CHECK
家庭医生:FAMILY_DOCTOR
家庭医生服务记录:FAMILY_DOCTOR_SERVICES
就医协助:MEDICAL_ASSISTANCE
顾问服务:CONSULTING_SERVICES
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部父单号
	 */
	@ApiField("out_parent_order_id")
	private String outParentOrderId;

	/**
	 * 外部子用户ID
	 */
	@ApiField("out_sub_user_id")
	private String outSubUserId;

	/**
	 * 外部自有用户id，无特殊校验
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public RemindVO getData() {
		return this.data;
	}
	public void setData(RemindVO data) {
		this.data = data;
	}

	public String getEbUserId() {
		return this.ebUserId;
	}
	public void setEbUserId(String ebUserId) {
		this.ebUserId = ebUserId;
	}

	public String getInquiryMode() {
		return this.inquiryMode;
	}
	public void setInquiryMode(String inquiryMode) {
		this.inquiryMode = inquiryMode;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public Date getMsgTime() {
		return this.msgTime;
	}
	public void setMsgTime(Date msgTime) {
		this.msgTime = msgTime;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutParentOrderId() {
		return this.outParentOrderId;
	}
	public void setOutParentOrderId(String outParentOrderId) {
		this.outParentOrderId = outParentOrderId;
	}

	public String getOutSubUserId() {
		return this.outSubUserId;
	}
	public void setOutSubUserId(String outSubUserId) {
		this.outSubUserId = outSubUserId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
