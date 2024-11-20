package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单状态同步-扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-11-18 16:55:19
 */
public class PlatformInquiryOrderStatusExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8231364136415553572L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 已取消：取消原因
超时取消 TIMEOUT_CANCEL
用户取消 CANCEL_BY_USER
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

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
	 * 接诊医生外部医生ID
	 */
	@ApiField("doctor_out_id")
	private String doctorOutId;

	/**
	 * 接诊医生姓名
	 */
	@ApiField("doctor_out_name")
	private String doctorOutName;

	/**
	 * 是否首次回复
	 */
	@ApiField("first_reply")
	private Boolean firstReply;

	/**
	 * 接诊时间
	 */
	@ApiField("gmt_adoption")
	private Date gmtAdoption;

	/**
	 * 取消时间
	 */
	@ApiField("gmt_cancel")
	private Date gmtCancel;

	/**
	 * 问诊单完成时间
	 */
	@ApiField("gmt_finished")
	private Date gmtFinished;

	/**
	 * 支付时间
	 */
	@ApiField("gmt_paid")
	private Date gmtPaid;

	/**
	 * 退款时间
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/**
	 * 退款申请时间
	 */
	@ApiField("gmt_refund_applying")
	private Date gmtRefundApplying;

	/**
	 * 是否触发消息通知
	 */
	@ApiField("notice")
	private Boolean notice;

	/**
	 * 实付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款审核失败原因
	 */
	@ApiField("reject_refund_reason")
	private String rejectRefundReason;

	/**
	 * 5分钟未支付消息提醒
	 */
	@ApiField("remind_pay")
	private Boolean remindPay;

	/**
	 * 回复内容
	 */
	@ApiField("reply_content")
	private String replyContent;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
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

	public String getDoctorOutId() {
		return this.doctorOutId;
	}
	public void setDoctorOutId(String doctorOutId) {
		this.doctorOutId = doctorOutId;
	}

	public String getDoctorOutName() {
		return this.doctorOutName;
	}
	public void setDoctorOutName(String doctorOutName) {
		this.doctorOutName = doctorOutName;
	}

	public Boolean getFirstReply() {
		return this.firstReply;
	}
	public void setFirstReply(Boolean firstReply) {
		this.firstReply = firstReply;
	}

	public Date getGmtAdoption() {
		return this.gmtAdoption;
	}
	public void setGmtAdoption(Date gmtAdoption) {
		this.gmtAdoption = gmtAdoption;
	}

	public Date getGmtCancel() {
		return this.gmtCancel;
	}
	public void setGmtCancel(Date gmtCancel) {
		this.gmtCancel = gmtCancel;
	}

	public Date getGmtFinished() {
		return this.gmtFinished;
	}
	public void setGmtFinished(Date gmtFinished) {
		this.gmtFinished = gmtFinished;
	}

	public Date getGmtPaid() {
		return this.gmtPaid;
	}
	public void setGmtPaid(Date gmtPaid) {
		this.gmtPaid = gmtPaid;
	}

	public Date getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

	public Date getGmtRefundApplying() {
		return this.gmtRefundApplying;
	}
	public void setGmtRefundApplying(Date gmtRefundApplying) {
		this.gmtRefundApplying = gmtRefundApplying;
	}

	public Boolean getNotice() {
		return this.notice;
	}
	public void setNotice(Boolean notice) {
		this.notice = notice;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRejectRefundReason() {
		return this.rejectRefundReason;
	}
	public void setRejectRefundReason(String rejectRefundReason) {
		this.rejectRefundReason = rejectRefundReason;
	}

	public Boolean getRemindPay() {
		return this.remindPay;
	}
	public void setRemindPay(Boolean remindPay) {
		this.remindPay = remindPay;
	}

	public String getReplyContent() {
		return this.replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

}
