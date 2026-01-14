package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 股票实时报价查询
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:41:29
 */
public class AlipayFinanceQuotationQuotetradeopenSnapshotBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1695363889296612454L;

	/**
	 * 股票唯一编码，symbol=code.market
	 */
	@ApiListField("symbols")
	@ApiField("string")
	private List<String> symbols;

	public List<String> getSymbols() {
		return this.symbols;
	}
	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

}
