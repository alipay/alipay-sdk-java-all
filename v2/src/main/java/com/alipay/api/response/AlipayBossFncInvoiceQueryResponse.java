package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ArInvoiceOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 17:39:18
 */
public class AlipayBossFncInvoiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4221349877281263436L;

	/** 
	 * 查询返回结果：发票信息
	 */
	@ApiField("result_set")
	private ArInvoiceOpenApiResponse resultSet;

	public void setResultSet(ArInvoiceOpenApiResponse resultSet) {
		this.resultSet = resultSet;
	}
	public ArInvoiceOpenApiResponse getResultSet( ) {
		return this.resultSet;
	}

}
