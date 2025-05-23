package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算发票关联
 *
 * @author auto create
 * @since 1.0, 2022-05-06 16:57:48
 */
public class AlipayBossFncGfsettleprodInvoicerelateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8193289835369776366L;

	/**
	 * 关联发票请求
	 */
	@ApiField("relate_input_invoice_order_dto")
	private RelateInputInvoiceOrderDTO relateInputInvoiceOrderDto;

	public RelateInputInvoiceOrderDTO getRelateInputInvoiceOrderDto() {
		return this.relateInputInvoiceOrderDto;
	}
	public void setRelateInputInvoiceOrderDto(RelateInputInvoiceOrderDTO relateInputInvoiceOrderDto) {
		this.relateInputInvoiceOrderDto = relateInputInvoiceOrderDto;
	}

}
