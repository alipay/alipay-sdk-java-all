package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeatherAlertDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.weather.alert.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-08 12:17:56
 */
public class DatadigitalAnttechWeatherAlertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6691174259185931346L;

	/** 
	 * null
	 */
	@ApiListField("alerts")
	@ApiField("weather_alert_d_t_o")
	private List<WeatherAlertDTO> alerts;

	public void setAlerts(List<WeatherAlertDTO> alerts) {
		this.alerts = alerts;
	}
	public List<WeatherAlertDTO> getAlerts( ) {
		return this.alerts;
	}

}
