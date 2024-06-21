package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票查询结果
 *
 * @author auto create
 * @since 1.0, 2023-08-29 20:52:14
 */
public class InputInvoiceQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 7585348597756363428L;

	/**
	 * 发票数据
	 */
	@ApiListField("data")
	@ApiField("input_invoice_open_api_d_t_o")
	private List<InputInvoiceOpenApiDTO> data;

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

	public List<InputInvoiceOpenApiDTO> getData() {
		return this.data;
	}
	public void setData(List<InputInvoiceOpenApiDTO> data) {
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
