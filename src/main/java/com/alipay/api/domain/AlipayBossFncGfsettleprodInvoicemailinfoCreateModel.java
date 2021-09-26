package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加发票邮寄信息
 *
 * @author auto create
 * @since 1.0, 2021-08-05 15:25:33
 */
public class AlipayBossFncGfsettleprodInvoicemailinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4622667541333626523L;

	/**
	 * 邮寄信息
	 */
	@ApiField("invoice_mail_info_orde_dto")
	private InvoiceMailInfoOrderDTO invoiceMailInfoOrdeDto;

	public InvoiceMailInfoOrderDTO getInvoiceMailInfoOrdeDto() {
		return this.invoiceMailInfoOrdeDto;
	}
	public void setInvoiceMailInfoOrdeDto(InvoiceMailInfoOrderDTO invoiceMailInfoOrdeDto) {
		this.invoiceMailInfoOrdeDto = invoiceMailInfoOrdeDto;
	}

}
