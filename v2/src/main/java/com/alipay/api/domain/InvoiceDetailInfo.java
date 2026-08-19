package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票详细信息，包含所有的发票信息字段
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:22
 */
public class InvoiceDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 8439499679757843171L;

	/**
	 * 发票购方信息
	 */
	@ApiField("invoice_buyer_info")
	private InvoiceBuyerInfo invoiceBuyerInfo;

	/**
	 * 开票时间
	 */
	@ApiField("invoice_create_time")
	private Date invoiceCreateTime;

	/**
	 * 发票交付信息
	 */
	@ApiField("invoice_deliver_info")
	private InvoiceDeliverInfo invoiceDeliverInfo;

	/**
	 * 发票开票人信息
	 */
	@ApiField("invoice_issuer_info")
	private InvoiceIssuerInfo invoiceIssuerInfo;

	/**
	 * 发票商品明细
	 */
	@ApiListField("invoice_items")
	@ApiField("invoice_product_item_info")
	private List<InvoiceProductItemInfo> invoiceItems;

	/**
	 * 发票主体信息
	 */
	@ApiField("invoice_main_info")
	private InvoiceMainInfo invoiceMainInfo;

	/**
	 * [{"SINGLE_INVOICE":"单次开票"},{"MERGE_INVOICE":"合并开票"},{"RETRY_INVOICE":"登录后重试开票"}]
	 */
	@ApiField("invoice_mode")
	private String invoiceMode;

	/**
	 * 发票信息最晚更新时间
	 */
	@ApiField("invoice_modified_time")
	private Date invoiceModifiedTime;

	/**
	 * 发票备注与展示控制
	 */
	@ApiField("invoice_remark_info")
	private InvoiceRemarkInfo invoiceRemarkInfo;

	/**
	 * 发票销方信息
	 */
	@ApiField("invoice_seller_info")
	private InvoiceSellerInfo invoiceSellerInfo;

	/**
	 * 票据状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 支付信息列表
	 */
	@ApiListField("order_list")
	@ApiField("invoice_payment_info")
	private List<InvoicePaymentInfo> orderList;

	/**
	 * 商户外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 红票关联与红冲信息
	 */
	@ApiField("red_related_invoice_info")
	private RedRelatedInvoiceInfo redRelatedInvoiceInfo;

	/**
	 * saas发票单据号
	 */
	@ApiField("saas_invoice_order_no")
	private String saasInvoiceOrderNo;

	public InvoiceBuyerInfo getInvoiceBuyerInfo() {
		return this.invoiceBuyerInfo;
	}
	public void setInvoiceBuyerInfo(InvoiceBuyerInfo invoiceBuyerInfo) {
		this.invoiceBuyerInfo = invoiceBuyerInfo;
	}

	public Date getInvoiceCreateTime() {
		return this.invoiceCreateTime;
	}
	public void setInvoiceCreateTime(Date invoiceCreateTime) {
		this.invoiceCreateTime = invoiceCreateTime;
	}

	public InvoiceDeliverInfo getInvoiceDeliverInfo() {
		return this.invoiceDeliverInfo;
	}
	public void setInvoiceDeliverInfo(InvoiceDeliverInfo invoiceDeliverInfo) {
		this.invoiceDeliverInfo = invoiceDeliverInfo;
	}

	public InvoiceIssuerInfo getInvoiceIssuerInfo() {
		return this.invoiceIssuerInfo;
	}
	public void setInvoiceIssuerInfo(InvoiceIssuerInfo invoiceIssuerInfo) {
		this.invoiceIssuerInfo = invoiceIssuerInfo;
	}

	public List<InvoiceProductItemInfo> getInvoiceItems() {
		return this.invoiceItems;
	}
	public void setInvoiceItems(List<InvoiceProductItemInfo> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}

	public InvoiceMainInfo getInvoiceMainInfo() {
		return this.invoiceMainInfo;
	}
	public void setInvoiceMainInfo(InvoiceMainInfo invoiceMainInfo) {
		this.invoiceMainInfo = invoiceMainInfo;
	}

	public String getInvoiceMode() {
		return this.invoiceMode;
	}
	public void setInvoiceMode(String invoiceMode) {
		this.invoiceMode = invoiceMode;
	}

	public Date getInvoiceModifiedTime() {
		return this.invoiceModifiedTime;
	}
	public void setInvoiceModifiedTime(Date invoiceModifiedTime) {
		this.invoiceModifiedTime = invoiceModifiedTime;
	}

	public InvoiceRemarkInfo getInvoiceRemarkInfo() {
		return this.invoiceRemarkInfo;
	}
	public void setInvoiceRemarkInfo(InvoiceRemarkInfo invoiceRemarkInfo) {
		this.invoiceRemarkInfo = invoiceRemarkInfo;
	}

	public InvoiceSellerInfo getInvoiceSellerInfo() {
		return this.invoiceSellerInfo;
	}
	public void setInvoiceSellerInfo(InvoiceSellerInfo invoiceSellerInfo) {
		this.invoiceSellerInfo = invoiceSellerInfo;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public List<InvoicePaymentInfo> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<InvoicePaymentInfo> orderList) {
		this.orderList = orderList;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public RedRelatedInvoiceInfo getRedRelatedInvoiceInfo() {
		return this.redRelatedInvoiceInfo;
	}
	public void setRedRelatedInvoiceInfo(RedRelatedInvoiceInfo redRelatedInvoiceInfo) {
		this.redRelatedInvoiceInfo = redRelatedInvoiceInfo;
	}

	public String getSaasInvoiceOrderNo() {
		return this.saasInvoiceOrderNo;
	}
	public void setSaasInvoiceOrderNo(String saasInvoiceOrderNo) {
		this.saasInvoiceOrderNo = saasInvoiceOrderNo;
	}

}
