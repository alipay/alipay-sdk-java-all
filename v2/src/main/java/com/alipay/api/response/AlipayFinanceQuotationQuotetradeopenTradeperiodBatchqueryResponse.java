package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjTradingPeriodDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.tradeperiod.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-01 11:57:57
 */
public class AlipayFinanceQuotationQuotetradeopenTradeperiodBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3319529762963675235L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("obj_trading_period_d_t_o")
	private List<ObjTradingPeriodDTO> data;

	public void setData(List<ObjTradingPeriodDTO> data) {
		this.data = data;
	}
	public List<ObjTradingPeriodDTO> getData( ) {
		return this.data;
	}

}
