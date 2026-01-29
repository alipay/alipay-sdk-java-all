package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.tradingday.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 11:42:28
 */
public class AlipayFinanceQuotationQuotetradeopenTradingdayBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2544499549696386791L;

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
