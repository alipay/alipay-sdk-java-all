package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项发票查验
 *
 * @author auto create
 * @since 1.0, 2026-08-19 11:34:13
 */
public class AlipayBossFncInputInvoiceCheckModel extends AlipayObject {

	private static final long serialVersionUID = 4525477417331968464L;

	/**
	 * 发票验真入参
	 */
	@ApiField("invoice_sync_check_dto")
	private InvoiceSyncCheckDTO invoiceSyncCheckDto;

	public InvoiceSyncCheckDTO getInvoiceSyncCheckDto() {
		return this.invoiceSyncCheckDto;
	}
	public void setInvoiceSyncCheckDto(InvoiceSyncCheckDTO invoiceSyncCheckDto) {
		this.invoiceSyncCheckDto = invoiceSyncCheckDto;
	}

}
