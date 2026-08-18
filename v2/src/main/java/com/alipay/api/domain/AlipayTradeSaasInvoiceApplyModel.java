package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开票申请
 *
 * @author auto create
 * @since 1.0, 2026-08-14 20:02:47
 */
public class AlipayTradeSaasInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1179543542741635946L;

	/**
	 * 发票购方信息
	 */
	@ApiField("invoice_buyer_info")
	private InvoiceBuyerInfo invoiceBuyerInfo;

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
	 * null
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
	 * [{"SINGLE_INVOICE":"单次开票"},{"MERGE_INVOICE":"合并开票"}]
	 */
	@ApiField("invoice_mode")
	private String invoiceMode;

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
	 * null
	 */
	@ApiListField("order_list")
	@ApiField("invoice_payment_info")
	private List<InvoicePaymentInfo> orderList;

	/**
	 * 商户外部开票或红冲请求号，商户维度唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 红票关联蓝票信息
	 */
	@ApiField("red_related_invoice_info")
	private RedRelatedInvoiceInfo redRelatedInvoiceInfo;

	public InvoiceBuyerInfo getInvoiceBuyerInfo() {
		return this.invoiceBuyerInfo;
	}
	public void setInvoiceBuyerInfo(InvoiceBuyerInfo invoiceBuyerInfo) {
		this.invoiceBuyerInfo = invoiceBuyerInfo;
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

}
