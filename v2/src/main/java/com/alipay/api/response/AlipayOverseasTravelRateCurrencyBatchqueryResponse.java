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
 * @since 1.0, 2022-12-29 14:07:56
 */
public class AlipayOverseasTravelRateCurrencyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3655615588271843258L;

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
