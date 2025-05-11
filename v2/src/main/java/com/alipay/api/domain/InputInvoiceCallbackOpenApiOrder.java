package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项票回调入参
 *
 * @author auto create
 * @since 1.0, 2023-10-13 13:44:26
 */
public class InputInvoiceCallbackOpenApiOrder extends AlipayObject {

	private static final long serialVersionUID = 1749313251792879279L;

	/**
	 * 失败原因
	 */
	@ApiField("error_info")
	private String errorInfo;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 确认的topic的mqKey
	 */
	@ApiField("mq_key")
	private String mqKey;

	/**
	 * 通知是否成功
	 */
	@ApiField("notify_succeeded")
	private Boolean notifySucceeded;

	public String getErrorInfo() {
		return this.errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getMqKey() {
		return this.mqKey;
	}
	public void setMqKey(String mqKey) {
		this.mqKey = mqKey;
	}

	public Boolean getNotifySucceeded() {
		return this.notifySucceeded;
	}
	public void setNotifySucceeded(Boolean notifySucceeded) {
		this.notifySucceeded = notifySucceeded;
	}

}
