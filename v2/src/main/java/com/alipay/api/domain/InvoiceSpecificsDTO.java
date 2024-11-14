package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 指定的到票关系DTO
 *
 * @author auto create
 * @since 1.0, 2023-08-25 16:43:44
 */
public class InvoiceSpecificsDTO extends AlipayObject {

	private static final long serialVersionUID = 8117768614575667326L;

	/**
	 * 发票到票DTO列表
	 */
	@ApiListField("invoice_arrival_dtos")
	@ApiField("invoice_arrival_d_t_o")
	private List<InvoiceArrivalDTO> invoiceArrivalDtos;

	/**
	 * 发票DTO
	 */
	@ApiField("invoice_dto")
	private InvoiceDTO invoiceDto;

	public List<InvoiceArrivalDTO> getInvoiceArrivalDtos() {
		return this.invoiceArrivalDtos;
	}
	public void setInvoiceArrivalDtos(List<InvoiceArrivalDTO> invoiceArrivalDtos) {
		this.invoiceArrivalDtos = invoiceArrivalDtos;
	}

	public InvoiceDTO getInvoiceDto() {
		return this.invoiceDto;
	}
	public void setInvoiceDto(InvoiceDTO invoiceDto) {
		this.invoiceDto = invoiceDto;
	}

}
