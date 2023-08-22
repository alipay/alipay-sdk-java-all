package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据发票ID获取关联的账单号以及与本发票相关的关联开票金额
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:37:41
 */
public class AlipayBossFncInvoiceLinkamtBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7672472662747344936L;

	/**
	 * 发票ID，唯一性ID，发票表唯一主键ID
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
