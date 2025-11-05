package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票信息
 *
 * @author auto create
 * @since 1.0, 2024-07-16 17:04:25
 */
public class Invoice extends AlipayObject {

	private static final long serialVersionUID = 2214235919679638298L;

	/**
	 * 邮箱地址
	 */
	@ApiField("email")
	private String email;

	/**
	 * 发票内容，配送服务费
	 */
	@ApiField("invoice_content")
	private String invoiceContent;

	/**
	 * 发票金额
	 */
	@ApiField("invoice_fee")
	private String invoiceFee;

	/**
	 * 发票抬头，如支付宝（杭州）信息技术有限公司
	 */
	@ApiField("invoice_title")
	private String invoiceTitle;

	/**
	 * 发票类型，0：默认电子发票
	 */
	@ApiField("invoice_type")
	private Long invoiceType;

	/**
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 收件人姓名
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 税号
	 */
	@ApiField("tax_number")
	private String taxNumber;

	/**
	 * 抬头类型，0：企业单位，1：个人/非企业
	 */
	@ApiField("title_type")
	private Long titleType;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getInvoiceContent() {
		return this.invoiceContent;
	}
	public void setInvoiceContent(String invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	public String getInvoiceFee() {
		return this.invoiceFee;
	}
	public void setInvoiceFee(String invoiceFee) {
		this.invoiceFee = invoiceFee;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public Long getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(Long invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public Long getTitleType() {
		return this.titleType;
	}
	public void setTitleType(Long titleType) {
		this.titleType = titleType;
	}

}
