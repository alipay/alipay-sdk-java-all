package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分发后建议修改发票
 *
 * @author auto create
 * @since 1.0, 2026-08-19 11:34:00
 */
public class AlipayBossFncInvoiceAfterdistributeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6169491423538718764L;

	/**
	 * 修改参数
	 */
	@ApiField("input_invoice_modify_after_distribute_dto")
	private InputInvoiceModifyAfterDistributeDTO inputInvoiceModifyAfterDistributeDto;

	public InputInvoiceModifyAfterDistributeDTO getInputInvoiceModifyAfterDistributeDto() {
		return this.inputInvoiceModifyAfterDistributeDto;
	}
	public void setInputInvoiceModifyAfterDistributeDto(InputInvoiceModifyAfterDistributeDTO inputInvoiceModifyAfterDistributeDto) {
		this.inputInvoiceModifyAfterDistributeDto = inputInvoiceModifyAfterDistributeDto;
	}

}
