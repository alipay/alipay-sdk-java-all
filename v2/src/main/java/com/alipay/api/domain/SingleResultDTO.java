package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个结果
 *
 * @author auto create
 * @since 1.0, 2023-08-29 21:12:30
 */
public class SingleResultDTO extends AlipayObject {

	private static final long serialVersionUID = 1734848654836297656L;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private Long invoiceId;

	/**
	 * 处理结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 处理结果信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 是否成功
	 */
	@ApiField("succeeded")
	private Boolean succeeded;

	public Long getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Boolean getSucceeded() {
		return this.succeeded;
	}
	public void setSucceeded(Boolean succeeded) {
		this.succeeded = succeeded;
	}

}
