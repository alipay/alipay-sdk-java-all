package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国际无账单openapi开票接口
 *
 * @author auto create
 * @since 1.0, 2026-01-21 11:26:15
 */
public class AlipayBossFncGfinvoiceOutputproformanobillApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2289844334467611532L;

	/**
	 * 国际新增发票OpenApiOrder
	 */
	@ApiField("proforma_invoice_add_order")
	private OpenApiProformaInvoiceAddOrder proformaInvoiceAddOrder;

	public OpenApiProformaInvoiceAddOrder getProformaInvoiceAddOrder() {
		return this.proformaInvoiceAddOrder;
	}
	public void setProformaInvoiceAddOrder(OpenApiProformaInvoiceAddOrder proformaInvoiceAddOrder) {
		this.proformaInvoiceAddOrder = proformaInvoiceAddOrder;
	}

}
