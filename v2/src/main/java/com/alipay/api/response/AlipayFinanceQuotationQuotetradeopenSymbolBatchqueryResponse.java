package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SymbolDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.symbol.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-20 15:57:04
 */
public class AlipayFinanceQuotationQuotetradeopenSymbolBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6792189762167493361L;

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
