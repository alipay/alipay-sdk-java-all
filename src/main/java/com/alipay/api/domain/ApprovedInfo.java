package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 泰国电子落地签批准结果信息。
EVOA approve infos.
 *
 * @author auto create
 * @since 1.0, 2019-11-15 10:20:55
 */
public class ApprovedInfo extends AlipayObject {

	private static final long serialVersionUID = 2194411182358374972L;

	/**
	 * 用户申请订单号回传。
Unique Application No.
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * URL to download approval letter
Approval letter 文件下载地址
	 */
	@ApiField("approval_letter_url")
	private String approvalLetterUrl;

	/**
	 * 泰国移民局发放的批准或拒绝码。
IMM’s code of approve or reject. Ex. “PAC2019020987654” , “NAC2019020987654”
	 */
	@ApiField("imm_code")
	private String immCode;

	/**
	 * 移民局办公室名称。
Immigration officer full name.
	 */
	@ApiField("imm_fullname")
	private String immFullname;

	/**
	 * 移民局办公室地址。
Immigration officer position.
	 */
	@ApiField("imm_position")
	private String immPosition;

	/**
	 * 记录。
Note.
	 */
	@ApiField("note")
	private String note;

	/**
	 * 支付费用详情
	 */
	@ApiField("payment_confirm_url")
	private String paymentConfirmUrl;

	/**
	 * URL to download receipt.
办理收据文件下载地址。
	 */
	@ApiField("receipt_url")
	private String receiptUrl;

	/**
	 * 备注。
Remark.
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 申请状态：通过/拒绝。
Status of application：Approved/Rejected.
	 */
	@ApiField("status")
	private String status;

	/**
	 * 批准状态变更时间。
DateTime of approved or rejected.
	 */
	@ApiField("status_date_time")
	private Date statusDateTime;

	/**
	 * URL to download TM.6
TM6 文件下载地址
	 */
	@ApiField("tm_6_url")
	private String tm6Url;

	/**
	 * URL to download TM.88
TM88 文件下载地址。
	 */
	@ApiField("tm_88_url")
	private String tm88Url;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getApprovalLetterUrl() {
		return this.approvalLetterUrl;
	}
	public void setApprovalLetterUrl(String approvalLetterUrl) {
		this.approvalLetterUrl = approvalLetterUrl;
	}

	public String getImmCode() {
		return this.immCode;
	}
	public void setImmCode(String immCode) {
		this.immCode = immCode;
	}

	public String getImmFullname() {
		return this.immFullname;
	}
	public void setImmFullname(String immFullname) {
		this.immFullname = immFullname;
	}

	public String getImmPosition() {
		return this.immPosition;
	}
	public void setImmPosition(String immPosition) {
		this.immPosition = immPosition;
	}

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public String getPaymentConfirmUrl() {
		return this.paymentConfirmUrl;
	}
	public void setPaymentConfirmUrl(String paymentConfirmUrl) {
		this.paymentConfirmUrl = paymentConfirmUrl;
	}

	public String getReceiptUrl() {
		return this.receiptUrl;
	}
	public void setReceiptUrl(String receiptUrl) {
		this.receiptUrl = receiptUrl;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusDateTime() {
		return this.statusDateTime;
	}
	public void setStatusDateTime(Date statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public String getTm6Url() {
		return this.tm6Url;
	}
	public void setTm6Url(String tm6Url) {
		this.tm6Url = tm6Url;
	}

	public String getTm88Url() {
		return this.tm88Url;
	}
	public void setTm88Url(String tm88Url) {
		this.tm88Url = tm88Url;
	}

}
