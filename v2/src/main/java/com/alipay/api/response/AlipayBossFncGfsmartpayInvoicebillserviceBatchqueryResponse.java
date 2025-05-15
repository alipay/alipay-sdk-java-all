package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResponseModelForInvoiceBillDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsmartpay.invoicebillservice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:06:43
 */
public class AlipayBossFncGfsmartpayInvoicebillserviceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1228731751792311215L;

	/** 
	 * 开票账单信息通用结果模型
	 */
	@ApiField("result_set")
	private ResponseModelForInvoiceBillDTO resultSet;

	public void setResultSet(ResponseModelForInvoiceBillDTO resultSet) {
		this.resultSet = resultSet;
	}
	public ResponseModelForInvoiceBillDTO getResultSet( ) {
		return this.resultSet;
	}

}
