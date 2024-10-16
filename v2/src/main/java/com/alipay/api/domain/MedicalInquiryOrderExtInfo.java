package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-06-25 15:02:51
 */
public class MedicalInquiryOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3422282659777747857L;

	/**
	 * 支付宝渠道订单标识，Y代表支付宝渠道订单
	 */
	@ApiField("alipay_channel_order_flag")
	private String alipayChannelOrderFlag;

	/**
	 * 审核意见
	 */
	@ApiField("approve_comment")
	private String approveComment;

	/**
	 * 链接格式
	 */
	@ApiField("chat_url")
	private String chatUrl;

	/**
	 * 联系医生问诊链接
	 */
	@ApiField("doctor_inquiry_link_page")
	private String doctorInquiryLinkPage;

	/**
	 * 链接格式
	 */
	@ApiField("invoice_url")
	private String invoiceUrl;

	/**
	 * 问诊订单评价信息
	 */
	@ApiField("medical_inquiry_order_evaluate_info")
	private MedicalInquiryOrderEvaluateInfo medicalInquiryOrderEvaluateInfo;

	/**
	 * 订单所属pid
	 */
	@ApiField("order_pid")
	private String orderPid;

	/**
	 * 加号核销码等信息
	 */
	@ApiField("plus_register_info")
	private PlusRegisterInfo plusRegisterInfo;

	/**
	 * 链接格式
	 */
	@ApiField("refund_url")
	private String refundUrl;

	/**
	 * 订单来源
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

	public MedicalInquiryOrderEvaluateInfo getMedicalInquiryOrderEvaluateInfo() {
		return this.medicalInquiryOrderEvaluateInfo;
	}
	public void setMedicalInquiryOrderEvaluateInfo(MedicalInquiryOrderEvaluateInfo medicalInquiryOrderEvaluateInfo) {
		this.medicalInquiryOrderEvaluateInfo = medicalInquiryOrderEvaluateInfo;
	}

	public String getOrderPid() {
		return this.orderPid;
	}
	public void setOrderPid(String orderPid) {
		this.orderPid = orderPid;
	}

	public PlusRegisterInfo getPlusRegisterInfo() {
		return this.plusRegisterInfo;
	}
	public void setPlusRegisterInfo(PlusRegisterInfo plusRegisterInfo) {
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
