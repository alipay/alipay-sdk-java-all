package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票勾选入参
 *
 * @author auto create
 * @since 1.0, 2023-08-29 21:11:50
 */
public class InputInvoiceCertifyOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 2747323643175748849L;

	/**
	 * 发票id
	 */
	@ApiListField("invoice_ids")
	@ApiField("number")
	private List<Long> invoiceIds;

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

	public List<Long> getInvoiceIds() {
		return this.invoiceIds;
	}
	public void setInvoiceIds(List<Long> invoiceIds) {
		this.invoiceIds = invoiceIds;
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
