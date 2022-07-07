package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁统一结算发票录入并关联
 *
 * @author auto create
 * @since 1.0, 2022-02-23 17:17:06
 */
public class AlipayBossFncGfsettleprodPoinvoicerelateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7554741394334922376L;

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
