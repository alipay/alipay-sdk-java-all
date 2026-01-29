package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据发票ID查询发票信息
 *
 * @author auto create
 * @since 1.0, 2025-02-21 17:39:07
 */
public class AlipayBossFncInvoiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7563431421239583814L;

	/**
	 * 查询ID：用于标示一张发票，通过发票综合查询可以查询到该ID。
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
