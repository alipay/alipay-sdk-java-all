package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票通用响应模型
 *
 * @author auto create
 * @since 1.0, 2023-08-29 21:12:41
 */
public class InputInvoiceResponse extends AlipayObject {

	private static final long serialVersionUID = 4434764975496789591L;

	/**
	 * 结果码
	 */
	@ApiField("response_code")
	private String responseCode;

	/**
	 * 信息
	 */
	@ApiField("response_msg")
	private String responseMsg;

	/**
	 * 是否成功
	 */
	@ApiField("succeeded")
	private Boolean succeeded;

	public String getResponseCode() {
		return this.responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return this.responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public Boolean getSucceeded() {
		return this.succeeded;
	}
	public void setSucceeded(Boolean succeeded) {
		this.succeeded = succeeded;
	}

}
