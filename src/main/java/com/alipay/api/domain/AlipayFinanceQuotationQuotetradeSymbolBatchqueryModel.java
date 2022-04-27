package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 股票码表批量查询
 *
 * @author auto create
 * @since 1.0, 2020-12-02 23:07:57
 */
public class AlipayFinanceQuotationQuotetradeSymbolBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3161737833424577772L;

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
