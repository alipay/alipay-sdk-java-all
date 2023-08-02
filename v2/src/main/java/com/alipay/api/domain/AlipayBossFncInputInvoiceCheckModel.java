package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进项发票查验
 *
 * @author auto create
 * @since 1.0, 2023-07-26 14:56:32
 */
public class AlipayBossFncInputInvoiceCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7614674324687513844L;

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
