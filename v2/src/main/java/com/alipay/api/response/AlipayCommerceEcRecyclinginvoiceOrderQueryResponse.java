package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderInvoice;
import com.alipay.api.domain.RecyclinginvoiceOrderItem;
import com.alipay.api.domain.OrderPayment;
import com.alipay.api.domain.OrderTax;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-10 13:57:39
 */
public class AlipayCommerceEcRecyclinginvoiceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2276569791875114614L;

	/** 
	 * 收款即开票页面支付宝URL（自然人端） 在支付宝里打开的自然人缴税并收款页面，可从企业（商户）/服务商自有APP/小程序页面打开 供应商ID存在值时返回 未安装支付宝或使用受限目标容器时可能无法打开
	 */
	@ApiField("collection_invoice_page_alipay_url")
	private String collectionInvoicePageAlipayUrl;

	/** 
	 * 收款即开票页面URL（自然人端）
在支付宝里打开的自然人缴税并收款页面，可从企业（商户）/服务商自有APP/小程序页面打开
供应商ID存在值时返回
	 */
	@ApiField("collection_invoice_page_url")
	private String collectionInvoicePageUrl;

	/** 
	 * 企业（商户）营业员ID
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/** 
	 * 企业（商户）供应商ID
	 */
	@ApiField("company_supplier_id")
	private String companySupplierId;

	/** 
	 * 交易成功时间
	 */
	@ApiField("gmt_success")
	private Date gmtSuccess;

	/** 
	 * 订单的备注字段,用于发票的备注显示
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 订单金额（元，两位小数）
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/** 
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单发票列表
	 */
	@ApiListField("order_invoice_list")
	@ApiField("order_invoice")
	private List<OrderInvoice> orderInvoiceList;

	/** 
	 * 订单商品明细
	 */
	@ApiListField("order_item_list")
	@ApiField("recyclinginvoice_order_item")
	private List<RecyclinginvoiceOrderItem> orderItemList;

	/** 
	 * 订单支付单
	 */
	@ApiField("order_payment")
	private OrderPayment orderPayment;

	/** 
	 * 订单交易状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单缴税明细列表
	 */
	@ApiListField("order_tax_item_list")
	@ApiField("order_tax")
	private List<OrderTax> orderTaxItemList;

	/** 
	 * 外部订单号
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/** 
	 * 支付即开票页面支付宝URL（营业员端） 在支付宝里打开的营业员端页面，若营业员未登录过支付宝反向开票小程序，需先打开登录页 未安装支付宝或使用受限目标容器时可能无法打开
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
该二维码链接有效期和反向开票助手小程序中刷新时间（5分钟）保持一致，供应商ID存在时不返回
	 */
	@ApiField("payment_invoice_qr_code_url")
	private String paymentInvoiceQrCodeUrl;

	/** 
	 * 发票产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/** 
	 * 卖家名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/** 
	 * 用于标记卖家支付宝用户在应用下的唯一标识
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	/** 
	 * 卖家手机号
	 */
	@ApiField("seller_phone")
	private String sellerPhone;

	/** 
	 * 卖家用户ID
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	/** 
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/** 
	 * 订单缴税总额（元，两位小数）
	 */
	@ApiField("tax_total_amount")
	private String taxTotalAmount;

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

	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}
	public String getCompanyClerkId( ) {
		return this.companyClerkId;
	}

	public void setCompanySupplierId(String companySupplierId) {
		this.companySupplierId = companySupplierId;
	}
	public String getCompanySupplierId( ) {
		return this.companySupplierId;
	}

	public void setGmtSuccess(Date gmtSuccess) {
		this.gmtSuccess = gmtSuccess;
	}
	public Date getGmtSuccess( ) {
		return this.gmtSuccess;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderAmount( ) {
		return this.orderAmount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderInvoiceList(List<OrderInvoice> orderInvoiceList) {
		this.orderInvoiceList = orderInvoiceList;
	}
	public List<OrderInvoice> getOrderInvoiceList( ) {
		return this.orderInvoiceList;
	}

	public void setOrderItemList(List<RecyclinginvoiceOrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	public List<RecyclinginvoiceOrderItem> getOrderItemList( ) {
		return this.orderItemList;
	}

	public void setOrderPayment(OrderPayment orderPayment) {
		this.orderPayment = orderPayment;
	}
	public OrderPayment getOrderPayment( ) {
		return this.orderPayment;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderTaxItemList(List<OrderTax> orderTaxItemList) {
		this.orderTaxItemList = orderTaxItemList;
	}
	public List<OrderTax> getOrderTaxItemList( ) {
		return this.orderTaxItemList;
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

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerName( ) {
		return this.sellerName;
	}

	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}
	public String getSellerOpenId( ) {
		return this.sellerOpenId;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
	public String getSellerPhone( ) {
		return this.sellerPhone;
	}

	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	public String getSellerUserId( ) {
		return this.sellerUserId;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getTaxNo( ) {
		return this.taxNo;
	}

	public void setTaxTotalAmount(String taxTotalAmount) {
		this.taxTotalAmount = taxTotalAmount;
	}
	public String getTaxTotalAmount( ) {
		return this.taxTotalAmount;
	}

}
