package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SymbolDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.symbol.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-10 13:43:17
 */
public class AlipayFinanceQuotationQuotetradeSymbolBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5377819184391183427L;

	/** 
	 * 码表
	 */
	@ApiListField("data")
	@ApiField("symbol_d_t_o")
	private List<SymbolDTO> data;

	public void setData(List<SymbolDTO> data) {
		this.data = data;
	}
	public List<SymbolDTO> getData( ) {
		return this.data;
	}

}
