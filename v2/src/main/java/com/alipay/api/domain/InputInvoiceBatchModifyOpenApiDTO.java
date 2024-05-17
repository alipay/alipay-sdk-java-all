package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改参数
 *
 * @author auto create
 * @since 1.0, 2023-08-30 14:26:52
 */
public class InputInvoiceBatchModifyOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 8862427946445248419L;

	/**
	 * 修改模型
	 */
	@ApiListField("input_invoice_modify_open_api_dto_list")
	@ApiField("input_invoice_modify_open_api_d_t_o")
	private List<InputInvoiceModifyOpenApiDTO> inputInvoiceModifyOpenApiDtoList;

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
	 * 请求幂等号
	 */
	@ApiField("request_no")
	private String requestNo;

	public List<InputInvoiceModifyOpenApiDTO> getInputInvoiceModifyOpenApiDtoList() {
		return this.inputInvoiceModifyOpenApiDtoList;
	}
	public void setInputInvoiceModifyOpenApiDtoList(List<InputInvoiceModifyOpenApiDTO> inputInvoiceModifyOpenApiDtoList) {
		this.inputInvoiceModifyOpenApiDtoList = inputInvoiceModifyOpenApiDtoList;
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
