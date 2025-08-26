package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无票付款
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:24:47
 */
public class AlipayBossFncGfsettleprodNoinvoicePayModel extends AlipayObject {

	private static final long serialVersionUID = 8761377225676736776L;

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
