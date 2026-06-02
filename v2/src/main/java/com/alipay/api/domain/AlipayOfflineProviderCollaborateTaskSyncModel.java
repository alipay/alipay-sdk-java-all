package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商同步leads任务信息
 *
 * @author auto create
 * @since 1.0, 2026-03-26 16:30:36
 */
public class AlipayOfflineProviderCollaborateTaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8828439999988859786L;

	/**
	 * 商家是否完成交付
	 */
	@ApiField("delivery_completed")
	private String deliveryCompleted;

	/**
	 * 商家完成交付日期
	 */
	@ApiField("delivery_completion_date")
	private String deliveryCompletionDate;

	/**
	 * 商家首次动销日期
	 */
	@ApiField("first_sales_date")
	private String firstSalesDate;

	/**
	 * 是否有点单笔数
	 */
	@ApiField("order_transaction")
	private String orderTransaction;

	/**
	 * 外部商户ID
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 商家是否连接打印机
	 */
	@ApiField("printer_connected")
	private String printerConnected;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 任务单号leads_id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 商家上传商品数量
	 */
	@ApiField("uploaded_product_count")
	private Long uploadedProductCount;

	public String getDeliveryCompleted() {
		return this.deliveryCompleted;
	}
	public void setDeliveryCompleted(String deliveryCompleted) {
		this.deliveryCompleted = deliveryCompleted;
	}

	public String getDeliveryCompletionDate() {
		return this.deliveryCompletionDate;
	}
	public void setDeliveryCompletionDate(String deliveryCompletionDate) {
		this.deliveryCompletionDate = deliveryCompletionDate;
	}

	public String getFirstSalesDate() {
		return this.firstSalesDate;
	}
	public void setFirstSalesDate(String firstSalesDate) {
		this.firstSalesDate = firstSalesDate;
	}

	public String getOrderTransaction() {
		return this.orderTransaction;
	}
	public void setOrderTransaction(String orderTransaction) {
		this.orderTransaction = orderTransaction;
	}

	public String getOutMerchantId() {
		return this.outMerchantId;
	}
	public void setOutMerchantId(String outMerchantId) {
		this.outMerchantId = outMerchantId;
	}

	public String getPrinterConnected() {
		return this.printerConnected;
	}
	public void setPrinterConnected(String printerConnected) {
		this.printerConnected = printerConnected;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Long getUploadedProductCount() {
		return this.uploadedProductCount;
	}
	public void setUploadedProductCount(Long uploadedProductCount) {
		this.uploadedProductCount = uploadedProductCount;
	}

}
