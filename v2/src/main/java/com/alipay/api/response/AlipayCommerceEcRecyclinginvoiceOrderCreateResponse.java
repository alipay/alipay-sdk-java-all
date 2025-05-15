package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 19:42:25
 */
public class AlipayCommerceEcRecyclinginvoiceOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3136528731937565925L;

	/** 
	 * 收款即开票页面支付宝URL（自然人端）
在支付宝里打开的自然人缴税并收款页面，可从企业（商户）/服务商自有APP/小程序页面打开
供应商ID存在值时返回
未安装支付宝或使用受限目标容器时可能无法打开
	 */
	@ApiField("collection_invoice_page_alipay_url")
	private String collectionInvoicePageAlipayUrl;

	/** 
	 * 收款即开票页面URL（自然人端）
在支付宝里打开的自然人缴税并收款页面，可从企业（商户）/服务商自有APP/小程序页面打开
供应商ID传值时返回
	 */
	@ApiField("collection_invoice_page_url")
	private String collectionInvoicePageUrl;

	/** 
	 * 订单的备注字段,用于发票的备注显示
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部订单号
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/** 
	 * 支付即开票页面支付宝URL（营业员端）
在支付宝里打开的营业员端页面，若营业员未登录过支付宝反向开票小程序，需先打开登录页
未安装支付宝或使用受限目标容器时可能无法打开
	 */
	@ApiField("payment_invoice_page_alipay_url")
	private String paymentInvoicePageAlipayUrl;

	/** 
	 * 支付即开票页面URL（营业员端）
在支付宝里打开的营业员端页面，若营业员未登录过支付宝反向开票小程序，需先打开登录页
	 */
	@ApiField("payment_invoice_page_url")
	private String paymentInvoicePageUrl;

	/** 
	 * 支付即开票二维码URL（营业员端）
可以嵌入在企业（商户）/服务商自有APP/小程序页面中的二维码，供自然人扫码
该二维码链接有效期和反向开票助手小程序中刷新时间（5分钟）保持一致
	 */
	@ApiField("payment_invoice_qr_code_url")
	private String paymentInvoiceQrCodeUrl;

	/** 
	 * 税务机关监管提醒
	 */
	@ApiField("tax_authority_remind")
	private String taxAuthorityRemind;

	public void setCollectionInvoicePageAlipayUrl(String collectionInvoicePageAlipayUrl) {
		this.collectionInvoicePageAlipayUrl = collectionInvoicePageAlipayUrl;
	}
	public String getCollectionInvoicePageAlipayUrl( ) {
		return this.collectionInvoicePageAlipayUrl;
	}

	public void setCollectionInvoicePageUrl(String collectionInvoicePageUrl) {
		this.collectionInvoicePageUrl = collectionInvoicePageUrl;
	}
	public String getCollectionInvoicePageUrl( ) {
		return this.collectionInvoicePageUrl;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}
	public String getOuterOrderId( ) {
		return this.outerOrderId;
	}

	public void setPaymentInvoicePageAlipayUrl(String paymentInvoicePageAlipayUrl) {
		this.paymentInvoicePageAlipayUrl = paymentInvoicePageAlipayUrl;
	}
	public String getPaymentInvoicePageAlipayUrl( ) {
		return this.paymentInvoicePageAlipayUrl;
	}

	public void setPaymentInvoicePageUrl(String paymentInvoicePageUrl) {
		this.paymentInvoicePageUrl = paymentInvoicePageUrl;
	}
	public String getPaymentInvoicePageUrl( ) {
		return this.paymentInvoicePageUrl;
	}

	public void setPaymentInvoiceQrCodeUrl(String paymentInvoiceQrCodeUrl) {
		this.paymentInvoiceQrCodeUrl = paymentInvoiceQrCodeUrl;
	}
	public String getPaymentInvoiceQrCodeUrl( ) {
		return this.paymentInvoiceQrCodeUrl;
	}

	public void setTaxAuthorityRemind(String taxAuthorityRemind) {
		this.taxAuthorityRemind = taxAuthorityRemind;
	}
	public String getTaxAuthorityRemind( ) {
		return this.taxAuthorityRemind;
	}

}
