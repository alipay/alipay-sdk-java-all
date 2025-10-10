package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分发后简易修改入参
 *
 * @author auto create
 * @since 1.0, 2023-08-30 14:26:01
 */
public class InputInvoiceModifyAfterDistributeDTO extends AlipayObject {

	private static final long serialVersionUID = 2787299797913258935L;

	/**
	 * 修改参数
	 */
	@ApiField("input_invoice_modify_open_api_dto")
	private InputInvoiceModifyOpenApiDTO inputInvoiceModifyOpenApiDto;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 平台code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 请求号
	 */
	@ApiField("request_no")
	private String requestNo;

	public InputInvoiceModifyOpenApiDTO getInputInvoiceModifyOpenApiDto() {
		return this.inputInvoiceModifyOpenApiDto;
	}
	public void setInputInvoiceModifyOpenApiDto(InputInvoiceModifyOpenApiDTO inputInvoiceModifyOpenApiDto) {
		this.inputInvoiceModifyOpenApiDto = inputInvoiceModifyOpenApiDto;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
