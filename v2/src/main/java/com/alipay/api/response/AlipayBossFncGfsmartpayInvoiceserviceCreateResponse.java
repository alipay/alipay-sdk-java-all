package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResponseModelForInvoiceBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsmartpay.invoiceservice.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-25 16:46:44
 */
public class AlipayBossFncGfsmartpayInvoiceserviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6178615989889892245L;

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
