package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团发票分发、验真、勾选等操作通知接口
 *
 * @author auto create
 * @since 1.0, 2022-06-13 21:42:58
 */
public class AlipayBossFncInputinvoiceInvoiceNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4757339763384757859L;

	/**
	 * 错误代码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 发票id,唯一
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 集团的mqKey,蚂蚁侧用做幂等键
	 */
	@ApiField("mq_key")
	private String mqKey;

	/**
	 * 业务处理结果，只有当processType是验真和勾选时，才会携带processResult结果信息
	 */
	@ApiField("process_result")
	private Boolean processResult;

	/**
	 * 业务处理类型，RETURN_COMPLETE、CERTIFY、DISTRIBUTED_WITHDRAW、DISTRIBUTE、CHECK
	 */
	@ApiField("process_type")
	private String processType;

	/**
	 * 业务关联单号
	 */
	@ApiField("related_order")
	private String relatedOrder;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getMqKey() {
		return this.mqKey;
	}
	public void setMqKey(String mqKey) {
		this.mqKey = mqKey;
	}

	public Boolean getProcessResult() {
		return this.processResult;
	}
	public void setProcessResult(Boolean processResult) {
		this.processResult = processResult;
	}

	public String getProcessType() {
		return this.processType;
	}
	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getRelatedOrder() {
		return this.relatedOrder;
	}
	public void setRelatedOrder(String relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
