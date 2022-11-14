package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算发票操作信息
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:30:02
 */
public class InvoiceOperateParam extends AlipayObject {

	private static final long serialVersionUID = 5766866698424773947L;

	/**
	 * 发票ID
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * INVALID-发票作废
	 */
	@ApiField("operator_type")
	private String operatorType;

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

}
