package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公付支付信息
 *
 * @author auto create
 * @since 1.0, 2022-03-11 21:53:36
 */
public class EnterprisePayInfo extends AlipayObject {

	private static final long serialVersionUID = 1693463424652274624L;

	/**
	 * 开票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

}
