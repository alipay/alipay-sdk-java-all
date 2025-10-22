package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登记结果
 *
 * @author auto create
 * @since 1.0, 2023-08-29 21:11:37
 */
public class InputInvoiceRegisterResponse extends AlipayObject {

	private static final long serialVersionUID = 6235558556272951643L;

	/**
	 * 发票id
	 */
	@ApiField("data")
	private Long data;

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

	public Long getData() {
		return this.data;
	}
	public void setData(Long data) {
		this.data = data;
	}

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
