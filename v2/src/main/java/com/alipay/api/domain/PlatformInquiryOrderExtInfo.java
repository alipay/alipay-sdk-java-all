package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-07-23 14:55:15
 */
public class PlatformInquiryOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4835641615531691978L;

	/**
	 * 支付宝渠道订单标识
枚举值：
是:Y
否:N
	 */
	@ApiField("alipay_channel_order_flag")
	private String alipayChannelOrderFlag;

	/**
	 * 审核意见
	 */
	@ApiField("approve_comment")
	private String approveComment;

	/**
	 * 渠道描述
	 */
	@ApiField("channel_desc")
	private String channelDesc;

	/**
	 * 医患沟通详情链接
	 */
	@ApiField("chat_url")
	private String chatUrl;

	/**
	 * 病情主诉
	 */
	@ApiField("complaint")
	private String complaint;

	/**
	 * 医生职称中文描述
	 */
	@ApiField("doctor_avatar")
	private String doctorAvatar;

	/**
	 * 联系医生问诊链接
	 */
	@ApiField("doctor_inquiry_link_page")
	private String doctorInquiryLinkPage;

	/**
	 * 医生职称
	 */
	@ApiField("doctor_title")
	private String doctorTitle;

	/**
	 * 医生类型
	 */
	@ApiField("doctor_type")
	private String doctorType;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 订单开票入口
	 */
	@ApiField("invoice_url")
	private String invoiceUrl;

	/**
	 * 问诊订单评价信息
	 */
	@ApiField("medical_inquiry_order_evaluate_info")
	private PlatformInquiryOrderEvaluateInfo medicalInquiryOrderEvaluateInfo;

	/**
	 * 给好大夫定义的一个订单来源
	 */
	@ApiField("order_from")
	private String orderFrom;

	/**
	 * 订单所属pid
	 */
	@ApiField("order_pid")
	private String orderPid;

	/**
	 * 订单商品的spu名
	 */
	@ApiField("order_spu")
	private String orderSpu;

	/**
	 * 订单原价，单位元，保留小数点2位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 加号扩展信息
	 */
	@ApiField("plus_register_info")
	private PlatformPlusRegisterInfo plusRegisterInfo;

	/**
	 * 订单退款入口
	 */
	@ApiField("refund_url")
	private String refundUrl;

	/**
	 * 枚举值：
支付宝问诊频道:ALIPAY_INQUIRY_CHANNEL
支付宝义诊频道:ALIPAY_PUBLIC_WELFARE_INQUIRY_CHANNEL
支付宝小程序:ALIPAY_MINI_APP
支付宝其他渠道:ALIPAY_OTHER_CHANNEL
H5页面:H5
患者端app:PATIENT_APP
pc端:PC
微信小程序:WECHAT_APP
支付宝AQ:ALIPAY_AQ
AQ-APP:AQ_APP
AQ-小程序:AQ_MINI_APP
	 */
	@ApiField("source")
	private String source;

	public String getAlipayChannelOrderFlag() {
		return this.alipayChannelOrderFlag;
	}
	public void setAlipayChannelOrderFlag(String alipayChannelOrderFlag) {
		this.alipayChannelOrderFlag = alipayChannelOrderFlag;
	}

	public String getApproveComment() {
		return this.approveComment;
	}
	public void setApproveComment(String approveComment) {
		this.approveComment = approveComment;
	}

	public String getChannelDesc() {
		return this.channelDesc;
	}
	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}

	public String getChatUrl() {
		return this.chatUrl;
	}
	public void setChatUrl(String chatUrl) {
		this.chatUrl = chatUrl;
	}

	public String getComplaint() {
		return this.complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getDoctorAvatar() {
		return this.doctorAvatar;
	}
	public void setDoctorAvatar(String doctorAvatar) {
		this.doctorAvatar = doctorAvatar;
	}

	public String getDoctorInquiryLinkPage() {
		return this.doctorInquiryLinkPage;
	}
	public void setDoctorInquiryLinkPage(String doctorInquiryLinkPage) {
		this.doctorInquiryLinkPage = doctorInquiryLinkPage;
	}

	public String getDoctorTitle() {
		return this.doctorTitle;
	}
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
	}

	public String getDoctorType() {
		return this.doctorType;
	}
	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getInvoiceUrl() {
		return this.invoiceUrl;
	}
	public void setInvoiceUrl(String invoiceUrl) {
		this.invoiceUrl = invoiceUrl;
	}

	public PlatformInquiryOrderEvaluateInfo getMedicalInquiryOrderEvaluateInfo() {
		return this.medicalInquiryOrderEvaluateInfo;
	}
	public void setMedicalInquiryOrderEvaluateInfo(PlatformInquiryOrderEvaluateInfo medicalInquiryOrderEvaluateInfo) {
		this.medicalInquiryOrderEvaluateInfo = medicalInquiryOrderEvaluateInfo;
	}

	public String getOrderFrom() {
		return this.orderFrom;
	}
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}

	public String getOrderPid() {
		return this.orderPid;
	}
	public void setOrderPid(String orderPid) {
		this.orderPid = orderPid;
	}

	public String getOrderSpu() {
		return this.orderSpu;
	}
	public void setOrderSpu(String orderSpu) {
		this.orderSpu = orderSpu;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public PlatformPlusRegisterInfo getPlusRegisterInfo() {
		return this.plusRegisterInfo;
	}
	public void setPlusRegisterInfo(PlatformPlusRegisterInfo plusRegisterInfo) {
		this.plusRegisterInfo = plusRegisterInfo;
	}

	public String getRefundUrl() {
		return this.refundUrl;
	}
	public void setRefundUrl(String refundUrl) {
		this.refundUrl = refundUrl;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
