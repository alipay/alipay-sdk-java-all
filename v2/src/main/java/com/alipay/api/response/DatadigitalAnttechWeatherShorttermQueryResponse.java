package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeatherShortTermRainDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.weather.shortterm.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-08 11:22:55
 */
public class DatadigitalAnttechWeatherShorttermQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1375613234561533118L;

	/** 
	 * null
	 */
	@ApiListField("short_term_rains")
	@ApiField("weather_short_term_rain_d_t_o")
	private List<WeatherShortTermRainDTO> shortTermRains;

	public void setShortTermRains(List<WeatherShortTermRainDTO> shortTermRains) {
		this.shortTermRains = shortTermRains;
	}
	public List<WeatherShortTermRainDTO> getShortTermRains( ) {
		return this.shortTermRains;
	}

}
