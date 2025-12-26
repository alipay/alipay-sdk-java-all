package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.portfolio.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-09 10:32:22
 */
public class AntfortuneStockPortfolioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3639433967612152997L;

	/** 
	 * 自选股票标的列表
	 */
	@ApiListField("symbol_list")
	@ApiField("string")
	private List<String> symbolList;

	public void setSymbolList(List<String> symbolList) {
		this.symbolList = symbolList;
	}
	public List<String> getSymbolList( ) {
		return this.symbolList;
	}

}
