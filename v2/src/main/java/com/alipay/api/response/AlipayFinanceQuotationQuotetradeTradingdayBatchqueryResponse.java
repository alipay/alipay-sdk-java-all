package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.tradingday.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:07:39
 */
public class AlipayFinanceQuotationQuotetradeTradingdayBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5865591847773758593L;

	/** 
	 * 交易日数据, 格式为 yyyyMMdd. 逆序排序
	 */
	@ApiListField("data")
	@ApiField("string")
	private List<String> data;

	public void setData(List<String> data) {
		this.data = data;
	}
	public List<String> getData( ) {
		return this.data;
	}

}
