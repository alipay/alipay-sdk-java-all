package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票消息
 *
 * @author auto create
 * @since 1.0, 2023-09-11 20:03:02
 */
public class InputInvoiceMqDTO extends AlipayObject {

	private static final long serialVersionUID = 3525613621236974294L;

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
	 * 发票id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 发票模型,如果process_result为PRE_CHECK时,会将发票验真后的数据填充到此模型中
	 */
	@ApiField("input_invoice_dto")
	private InputInvoiceCheckResponse inputInvoiceDto;

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
	 * mqKey,用于消息幂等
	 */
	@ApiField("mq_key")
	private String mqKey;

	/**
	 * 目前只有当processType是验真和勾选时，发送消息才会携带processResult结果信息
	 */
	@ApiField("process_result")
	private Boolean processResult;

	/**
	 * 回调消息类型
	 */
	@ApiField("process_type")
	private String processType;

	/**
	 * 业务关联单号
	 */
	@ApiField("related_order")
	private String relatedOrder;

	/**
	 * 从发起验真接口获取taskId
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

	public InputInvoiceCheckResponse getInputInvoiceDto() {
		return this.inputInvoiceDto;
	}
	public void setInputInvoiceDto(InputInvoiceCheckResponse inputInvoiceDto) {
		this.inputInvoiceDto = inputInvoiceDto;
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
