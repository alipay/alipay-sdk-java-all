package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArInvoiceReturnOrderOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.returnorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:47:40
 */
public class AlipayBossFncInvoiceReturnorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5374314983949282387L;

	/** 
	 * 返回结果List
	 */
	@ApiListField("result_set")
	@ApiField("ar_invoice_return_order_open_api_response")
	private List<ArInvoiceReturnOrderOpenApiResponse> resultSet;

	public void setResultSet(List<ArInvoiceReturnOrderOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ArInvoiceReturnOrderOpenApiResponse> getResultSet( ) {
		return this.resultSet;
	}

}
