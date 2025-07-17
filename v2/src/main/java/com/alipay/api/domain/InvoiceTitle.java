package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票信息
 *
 * @author auto create
 * @since 1.0, 2025-06-16 10:16:15
 */
public class InvoiceTitle extends AlipayObject {

	private static final long serialVersionUID = 1752632129438969623L;

	/**
	 * 小程序云id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 发票抬头基本信息
	 */
	@ApiField("invoice_title_info")
	private InvoiceTitleInfo invoiceTitleInfo;

	/**
	 * 用户邮件信息列表
	 */
	@ApiListField("invoice_user_mail_info_orders")
	@ApiField("invoice_user_mail_info_order")
	private List<InvoiceUserMailInfoOrder> invoiceUserMailInfoOrders;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public InvoiceTitleInfo getInvoiceTitleInfo() {
		return this.invoiceTitleInfo;
	}
	public void setInvoiceTitleInfo(InvoiceTitleInfo invoiceTitleInfo) {
		this.invoiceTitleInfo = invoiceTitleInfo;
	}

	public List<InvoiceUserMailInfoOrder> getInvoiceUserMailInfoOrders() {
		return this.invoiceUserMailInfoOrders;
	}
	public void setInvoiceUserMailInfoOrders(List<InvoiceUserMailInfoOrder> invoiceUserMailInfoOrders) {
		this.invoiceUserMailInfoOrders = invoiceUserMailInfoOrders;
	}

}
