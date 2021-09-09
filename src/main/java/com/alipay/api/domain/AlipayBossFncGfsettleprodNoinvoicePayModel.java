package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无票付款
 *
 * @author auto create
 * @since 1.0, 2021-08-05 19:43:24
 */
public class AlipayBossFncGfsettleprodNoinvoicePayModel extends AlipayObject {

	private static final long serialVersionUID = 4259962296546216228L;

	/**
	 * 无票付款
	 */
	@ApiField("no_invoice_pay_order")
	private NoInvoicePayOrder noInvoicePayOrder;

	public NoInvoicePayOrder getNoInvoicePayOrder() {
		return this.noInvoicePayOrder;
	}
	public void setNoInvoicePayOrder(NoInvoicePayOrder noInvoicePayOrder) {
		this.noInvoicePayOrder = noInvoicePayOrder;
	}

}
