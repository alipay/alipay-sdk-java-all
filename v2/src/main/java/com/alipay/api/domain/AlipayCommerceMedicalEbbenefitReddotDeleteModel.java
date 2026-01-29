package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 未读红点消除
 *
 * @author auto create
 * @since 1.0, 2025-03-13 16:46:57
 */
public class AlipayCommerceMedicalEbbenefitReddotDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4491175638747422728L;

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
	 * 订单id
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
	 * 外部父单号(家庭医生的主单号)
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
