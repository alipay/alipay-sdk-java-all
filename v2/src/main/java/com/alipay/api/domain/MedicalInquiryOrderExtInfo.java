package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-12-04 10:47:33
 */
public class MedicalInquiryOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2457155166691135881L;

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
	 * 联系医生问诊链接
	 */
	@ApiField("doctor_inquiry_link_page")
	private String doctorInquiryLinkPage;

	/**
	 * 订单所属pid
	 */
	@ApiField("order_pid")
	private String orderPid;

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

	public String getDoctorInquiryLinkPage() {
		return this.doctorInquiryLinkPage;
	}
	public void setDoctorInquiryLinkPage(String doctorInquiryLinkPage) {
		this.doctorInquiryLinkPage = doctorInquiryLinkPage;
	}

	public String getOrderPid() {
		return this.orderPid;
	}
	public void setOrderPid(String orderPid) {
		this.orderPid = orderPid;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
