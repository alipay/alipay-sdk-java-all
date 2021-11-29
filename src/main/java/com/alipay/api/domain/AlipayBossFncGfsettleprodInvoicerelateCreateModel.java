package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算发票关联
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:25:58
 */
public class AlipayBossFncGfsettleprodInvoicerelateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2736464588353858238L;

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
