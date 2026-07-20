package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LongRangeWeatherVariables;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.weather.longrange.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-30 20:27:55
 */
public class DatadigitalAnttechWeatherLongrangeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3791368942584264733L;

	/** 
	 * 最新批次生成时间
	 */
	@ApiField("forecast_batch_time")
	private Date forecastBatchTime;

	/** 
	 * 预测的气象参数列表
	 */
	@ApiListField("weather_variables_list")
	@ApiField("long_range_weather_variables")
	private List<LongRangeWeatherVariables> weatherVariablesList;

	public void setForecastBatchTime(Date forecastBatchTime) {
		this.forecastBatchTime = forecastBatchTime;
	}
	public Date getForecastBatchTime( ) {
		return this.forecastBatchTime;
	}

	public void setWeatherVariablesList(List<LongRangeWeatherVariables> weatherVariablesList) {
		this.weatherVariablesList = weatherVariablesList;
	}
	public List<LongRangeWeatherVariables> getWeatherVariablesList( ) {
		return this.weatherVariablesList;
	}

}
