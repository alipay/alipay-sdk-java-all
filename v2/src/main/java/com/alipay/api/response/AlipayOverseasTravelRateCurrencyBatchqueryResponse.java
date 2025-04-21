package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RateCurrency;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.rate.currency.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOverseasTravelRateCurrencyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5664756661225975151L;

	/** 
	 * 汇率币种列表
	 */
	@ApiListField("currency_list")
	@ApiField("rate_currency")
	private List<RateCurrency> currencyList;

	public void setCurrencyList(List<RateCurrency> currencyList) {
		this.currencyList = currencyList;
	}
	public List<RateCurrency> getCurrencyList( ) {
		return this.currencyList;
	}

}
