package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开票信息结果
 *
 * @author auto create
 * @since 1.0, 2024-07-04 16:40:00
 */
public class InvoiceInfoOpenApiResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 5345142236232573638L;

	/**
	 * 开票信息
	 */
	@ApiListField("invoice_info_open_api_dto_list")
	@ApiField("invoice_info_open_api_d_t_o")
	private List<InvoiceInfoOpenApiDTO> invoiceInfoOpenApiDtoList;

	public List<InvoiceInfoOpenApiDTO> getInvoiceInfoOpenApiDtoList() {
		return this.invoiceInfoOpenApiDtoList;
	}
	public void setInvoiceInfoOpenApiDtoList(List<InvoiceInfoOpenApiDTO> invoiceInfoOpenApiDtoList) {
		this.invoiceInfoOpenApiDtoList = invoiceInfoOpenApiDtoList;
	}

}
