package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StockTaskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.stocktaskresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:10:16
 */
public class AlipayCommerceTransportAdStocktaskresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2849651143692411426L;

	/** 
	 * 库存查询结果
	 */
	@ApiField("stock_task_result")
	private StockTaskResult stockTaskResult;

	public void setStockTaskResult(StockTaskResult stockTaskResult) {
		this.stockTaskResult = stockTaskResult;
	}
	public StockTaskResult getStockTaskResult( ) {
		return this.stockTaskResult;
	}

}
