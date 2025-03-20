package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡回票任务列表查询
 *
 * @author auto create
 * @since 1.0, 2024-02-01 16:59:55
 */
public class AlipayFundMbpcardInvoicetaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3539471452836468953L;

	/**
	 * 开始时间，格式：yyyy-MM-dd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 结束时间，格式：yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 回票任务状态
	 */
	@ApiField("invoice_task_status")
	private String invoiceTaskStatus;

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
	 * 每页条数，最大值20
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInvoiceTaskStatus() {
		return this.invoiceTaskStatus;
	}
	public void setInvoiceTaskStatus(String invoiceTaskStatus) {
		this.invoiceTaskStatus = invoiceTaskStatus;
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
