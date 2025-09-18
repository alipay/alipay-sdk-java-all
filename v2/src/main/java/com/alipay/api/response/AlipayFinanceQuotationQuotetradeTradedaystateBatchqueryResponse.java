package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradePeriodDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.tradedaystate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:07:39
 */
public class AlipayFinanceQuotationQuotetradeTradedaystateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6874988617726218269L;

	/** 
	 * 交易周期内的市场状态
	 */
	@ApiListField("data")
	@ApiField("trade_period_d_t_o")
	private List<TradePeriodDTO> data;

	public void setData(List<TradePeriodDTO> data) {
		this.data = data;
	}
	public List<TradePeriodDTO> getData( ) {
		return this.data;
	}

}
