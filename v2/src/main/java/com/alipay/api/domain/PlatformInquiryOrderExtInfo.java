package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单扩展信息

 *
 * @author auto create
 * @since 1.0, 2024-11-22 17:30:37
 */
public class PlatformInquiryOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2727771834156221181L;

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
	 * 联系医生问诊链接
	 */
	@ApiField("doctor_inquiry_link_page")
	private String doctorInquiryLinkPage;

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
	 * 订单所属pid
	 */
	@ApiField("order_pid")
	private String orderPid;

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

	public String getDoctorInquiryLinkPage() {
		return this.doctorInquiryLinkPage;
	}
	public void setDoctorInquiryLinkPage(String doctorInquiryLinkPage) {
		this.doctorInquiryLinkPage = doctorInquiryLinkPage;
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

	public String getOrderPid() {
		return this.orderPid;
	}
	public void setOrderPid(String orderPid) {
		this.orderPid = orderPid;
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
