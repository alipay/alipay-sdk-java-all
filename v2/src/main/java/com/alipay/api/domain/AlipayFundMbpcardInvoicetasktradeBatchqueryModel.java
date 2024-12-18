package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡回票任务关联交易查询
 *
 * @author auto create
 * @since 1.0, 2024-02-01 16:28:49
 */
public class AlipayFundMbpcardInvoicetasktradeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8551852197867931821L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 回票任务id
	 */
	@ApiField("invoice_task_id")
	private String invoiceTaskId;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getInvoiceTaskId() {
		return this.invoiceTaskId;
	}
	public void setInvoiceTaskId(String invoiceTaskId) {
		this.invoiceTaskId = invoiceTaskId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
