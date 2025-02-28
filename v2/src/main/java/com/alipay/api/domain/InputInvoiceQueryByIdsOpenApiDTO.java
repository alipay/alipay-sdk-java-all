package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票查询
 *
 * @author auto create
 * @since 1.0, 2023-08-29 20:52:13
 */
public class InputInvoiceQueryByIdsOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 3352817923959256929L;

	/**
	 * 发票id
	 */
	@ApiListField("invoice_ids")
	@ApiField("number")
	private List<Long> invoiceIds;

	public List<Long> getInvoiceIds() {
		return this.invoiceIds;
	}
	public void setInvoiceIds(List<Long> invoiceIds) {
		this.invoiceIds = invoiceIds;
	}

}
