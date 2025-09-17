package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 股票码表批量查询
 *
 * @author auto create
 * @since 1.0, 2025-04-10 13:43:17
 */
public class AlipayFinanceQuotationQuotetradeSymbolBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5564476623539851527L;

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
