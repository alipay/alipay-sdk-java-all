package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OverseasTravelRate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.exchangerate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-24 11:11:48
 */
public class AlipayOverseasTravelExchangerateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8856994569443567854L;

	/** 
	 * 汇率描述
	 */
	@ApiField("rate_desc")
	private String rateDesc;

	/** 
	 * 汇率来源说明
	 */
	@ApiField("rate_source")
	private String rateSource;

	/** 
	 * 多个币种汇率结果，currency:货币代码，ISO标准alpha- 3币种代码;
rate:当前币种/CNY的汇率,Number(15,8)
currency_icon:货币图片的url地址
	 */
	@ApiListField("rates")
	@ApiField("overseas_travel_rate")
	private List<OverseasTravelRate> rates;

	public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}
	public String getRateDesc( ) {
		return this.rateDesc;
	}

	public void setRateSource(String rateSource) {
		this.rateSource = rateSource;
	}
	public String getRateSource( ) {
		return this.rateSource;
	}

	public void setRates(List<OverseasTravelRate> rates) {
		this.rates = rates;
	}
	public List<OverseasTravelRate> getRates( ) {
		return this.rates;
	}

}
