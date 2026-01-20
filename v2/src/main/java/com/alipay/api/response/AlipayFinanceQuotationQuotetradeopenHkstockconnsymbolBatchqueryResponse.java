package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HKStockConnSymbolDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.hkstockconnsymbol.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-06 19:22:43
 */
public class AlipayFinanceQuotationQuotetradeopenHkstockconnsymbolBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7239137324146361442L;

	/** 
	 * 港股通静态数据响应信息
	 */
	@ApiListField("data")
	@ApiField("h_k_stock_conn_symbol_d_t_o")
	private List<HKStockConnSymbolDTO> data;

	public void setData(List<HKStockConnSymbolDTO> data) {
		this.data = data;
	}
	public List<HKStockConnSymbolDTO> getData( ) {
		return this.data;
	}

}
