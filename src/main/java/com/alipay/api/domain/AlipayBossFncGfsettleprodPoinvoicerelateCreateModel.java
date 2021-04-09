package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁统一结算发票录入并关联
 *
 * @author auto create
 * @since 1.0, 2021-01-29 15:42:55
 */
public class AlipayBossFncGfsettleprodPoinvoicerelateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3719919287247164591L;

	/**
	 * 发票创建关联请求
	 */
	@ApiField("input_invoice_order_request")
	private InputInvoiceOrderRequest inputInvoiceOrderRequest;

	public InputInvoiceOrderRequest getInputInvoiceOrderRequest() {
		return this.inputInvoiceOrderRequest;
	}
	public void setInputInvoiceOrderRequest(InputInvoiceOrderRequest inputInvoiceOrderRequest) {
		this.inputInvoiceOrderRequest = inputInvoiceOrderRequest;
	}

}
