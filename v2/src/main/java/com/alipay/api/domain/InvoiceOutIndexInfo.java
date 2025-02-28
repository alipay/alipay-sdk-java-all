package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡外部索引信息，含发票id以及外部索引单号
 *
 * @author auto create
 * @since 1.0, 2024-01-23 16:42:46
 */
public class InvoiceOutIndexInfo extends AlipayObject {

	private static final long serialVersionUID = 8885845534162788395L;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票外部索引号
	 */
	@ApiField("invoice_out_no")
	private String invoiceOutNo;

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceOutNo() {
		return this.invoiceOutNo;
	}
	public void setInvoiceOutNo(String invoiceOutNo) {
		this.invoiceOutNo = invoiceOutNo;
	}

}
