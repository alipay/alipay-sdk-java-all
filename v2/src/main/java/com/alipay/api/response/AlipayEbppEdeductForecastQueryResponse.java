package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ededuct.forecast.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:51
 */
public class AlipayEbppEdeductForecastQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1841252994443171232L;

	/** 
	 * 是否符合预期，true则说明符合预测，false则说明不符合预测，需要进行拦截。
	 */
	@ApiField("forecast_expect")
	private Boolean forecastExpect;

	public void setForecastExpect(Boolean forecastExpect) {
		this.forecastExpect = forecastExpect;
	}
	public Boolean getForecastExpect( ) {
		return this.forecastExpect;
	}

}
