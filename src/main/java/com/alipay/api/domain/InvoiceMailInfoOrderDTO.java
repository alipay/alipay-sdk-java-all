package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票邮寄信息
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:29:20
 */
public class InvoiceMailInfoOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 5335215447654436473L;

	/**
	 * 需要添加快递的发票信息列表
	 */
	@ApiListField("invoice_ids")
	@ApiField("string")
	private List<String> invoiceIds;

	/**
	 * 发票邮寄日期 yyyyMMdd
	 */
	@ApiField("invoice_mail_date")
	private String invoiceMailDate;

	/**
	 * 快递公司名称
	 */
	@ApiField("mail_company_name")
	private String mailCompanyName;

	/**
	 * 邮寄原因
	 */
	@ApiField("mail_reason")
	private String mailReason;

	/**
	 * 发票邮寄类型 01：isv寄送 02：小二寄送
	 */
	@ApiField("mail_type")
	private String mailType;

	/**
	 * 操作者
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 联系地址
	 */
	@ApiField("recipient_address")
	private String recipientAddress;

	/**
	 * 联系人
	 */
	@ApiField("recipient_name")
	private String recipientName;

	/**
	 * 联系电话
	 */
	@ApiField("recipient_phone_number")
	private String recipientPhoneNumber;

	/**
	 * 寄件人地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/**
	 * 寄件人名称
	 */
	@ApiField("sender_name")
	private String senderName;

	/**
	 * 寄件人电话
	 */
	@ApiField("sender_phone_number")
	private String senderPhoneNumber;

	/**
	 * 快递单号
	 */
	@ApiField("tracking_number")
	private String trackingNumber;

	public List<String> getInvoiceIds() {
		return this.invoiceIds;
	}
	public void setInvoiceIds(List<String> invoiceIds) {
		this.invoiceIds = invoiceIds;
	}

	public String getInvoiceMailDate() {
		return this.invoiceMailDate;
	}
	public void setInvoiceMailDate(String invoiceMailDate) {
		this.invoiceMailDate = invoiceMailDate;
	}

	public String getMailCompanyName() {
		return this.mailCompanyName;
	}
	public void setMailCompanyName(String mailCompanyName) {
		this.mailCompanyName = mailCompanyName;
	}

	public String getMailReason() {
		return this.mailReason;
	}
	public void setMailReason(String mailReason) {
		this.mailReason = mailReason;
	}

	public String getMailType() {
		return this.mailType;
	}
	public void setMailType(String mailType) {
		this.mailType = mailType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRecipientAddress() {
		return this.recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}

	public String getRecipientName() {
		return this.recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientPhoneNumber() {
		return this.recipientPhoneNumber;
	}
	public void setRecipientPhoneNumber(String recipientPhoneNumber) {
		this.recipientPhoneNumber = recipientPhoneNumber;
	}

	public String getSenderAddress() {
		return this.senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderName() {
		return this.senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderPhoneNumber() {
		return this.senderPhoneNumber;
	}
	public void setSenderPhoneNumber(String senderPhoneNumber) {
		this.senderPhoneNumber = senderPhoneNumber;
	}

	public String getTrackingNumber() {
		return this.trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

}
