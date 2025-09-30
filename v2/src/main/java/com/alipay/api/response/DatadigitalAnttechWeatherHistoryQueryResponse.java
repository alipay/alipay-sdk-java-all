package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeatherVariables;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.weather.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-12 19:37:29
 */
public class DatadigitalAnttechWeatherHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2217523129888612916L;

	/** 
	 * 消耗token数量。
quota 的计量逻辑为13440个（例如14 天*10 个变量*一天 96 个数值）数值为一个单位，用户一次请求如果小于等于一个单位，则记为一个单位，如果大于一个单位则保留小数点后一位小数。
假设用户调用接口，请求历史 30 天的气象结果，需要请求 6 个变量，则理论用量为 （30*6*96）/（14*10*96），向上取整保留一位小数为1.3。
	 */
	@ApiField("quota_cost")
	private String quotaCost;

	/** 
	 * 气象变量列表，气象变量有入参中的weather_variables_mark确定
	 */
	@ApiListField("weather_variables_list")
	@ApiField("weather_variables")
	private List<WeatherVariables> weatherVariablesList;

	public void setQuotaCost(String quotaCost) {
		this.quotaCost = quotaCost;
	}
	public String getQuotaCost( ) {
		return this.quotaCost;
	}

	public void setWeatherVariablesList(List<WeatherVariables> weatherVariablesList) {
		this.weatherVariablesList = weatherVariablesList;
	}
	public List<WeatherVariables> getWeatherVariablesList( ) {
		return this.weatherVariablesList;
	}

}
