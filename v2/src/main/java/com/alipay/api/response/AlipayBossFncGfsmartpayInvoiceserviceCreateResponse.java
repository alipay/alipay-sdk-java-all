package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResponseModelForInvoiceBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsmartpay.invoiceservice.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:06:43
 */
public class AlipayBossFncGfsmartpayInvoiceserviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8723783136338383625L;

	/** 
	 * 通用返回结果
	 */
	@ApiField("result_set")
	private ResponseModelForInvoiceBill resultSet;

	public void setResultSet(ResponseModelForInvoiceBill resultSet) {
		this.resultSet = resultSet;
	}
	public ResponseModelForInvoiceBill getResultSet( ) {
		return this.resultSet;
	}

}
