package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-08 11:22:55
 */
public class WeatherShortTermRainDTO extends AlipayObject {

	private static final long serialVersionUID = 8354735736854566686L;

	/**
	 * 预报时间
	 */
	@ApiField("forecast_time")
	private Date forecastTime;

	/**
	 * 降水量，单位 mm
	 */
	@ApiField("precip")
	private String precip;

	/**
	 * 降水类型
	 */
	@ApiField("type")
	private String type;

	public Date getForecastTime() {
		return this.forecastTime;
	}
	public void setForecastTime(Date forecastTime) {
		this.forecastTime = forecastTime;
	}

	public String getPrecip() {
		return this.precip;
	}
	public void setPrecip(String precip) {
		this.precip = precip;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
