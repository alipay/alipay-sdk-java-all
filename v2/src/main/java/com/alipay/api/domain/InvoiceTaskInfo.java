package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回票任务详情信息
 *
 * @author auto create
 * @since 1.0, 2024-01-23 16:43:27
 */
public class InvoiceTaskInfo extends AlipayObject {

	private static final long serialVersionUID = 6271166692489146542L;

	/**
	 * 回票完成时间
	 */
	@ApiField("finish_date")
	private String finishDate;

	/**
	 * 已回票金额，单位为元
	 */
	@ApiField("finish_invoice_amount")
	private String finishInvoiceAmount;

	/**
	 * 应回票金额，单位为元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 回票主体名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 任务周期起始时间
	 */
	@ApiField("period_begin_date")
	private String periodBeginDate;

	/**
	 * 任务周期结束时间
	 */
	@ApiField("period_end_date")
	private String periodEndDate;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务状态
待提交回票:WAIT_INVOICE
发票处理中:INVOICE_PROCESSING
发票已验证完成：INVOICE_VERIFIED
已回票：INVOICED
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 当前任务的正向支付金额（单位为元）
	 */
	@ApiField("total_pay_amount")
	private String totalPayAmount;

	/**
	 * 当前回票任务中总退款的金额（单位为元）
	 */
	@ApiField("total_refund_amount")
	private String totalRefundAmount;

	public String getFinishDate() {
		return this.finishDate;
	}
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}

	public String getFinishInvoiceAmount() {
		return this.finishInvoiceAmount;
	}
	public void setFinishInvoiceAmount(String finishInvoiceAmount) {
		this.finishInvoiceAmount = finishInvoiceAmount;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getPeriodBeginDate() {
		return this.periodBeginDate;
	}
	public void setPeriodBeginDate(String periodBeginDate) {
		this.periodBeginDate = periodBeginDate;
	}

	public String getPeriodEndDate() {
		return this.periodEndDate;
	}
	public void setPeriodEndDate(String periodEndDate) {
		this.periodEndDate = periodEndDate;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTotalPayAmount() {
		return this.totalPayAmount;
	}
	public void setTotalPayAmount(String totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}

	public String getTotalRefundAmount() {
		return this.totalRefundAmount;
	}
	public void setTotalRefundAmount(String totalRefundAmount) {
		this.totalRefundAmount = totalRefundAmount;
	}

}
