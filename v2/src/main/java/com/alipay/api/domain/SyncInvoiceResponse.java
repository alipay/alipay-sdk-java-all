package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步发票返回
 *
 * @author auto create
 * @since 1.0, 2023-10-13 10:00:30
 */
public class SyncInvoiceResponse extends AlipayObject {

	private static final long serialVersionUID = 2852291534422961971L;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

}
