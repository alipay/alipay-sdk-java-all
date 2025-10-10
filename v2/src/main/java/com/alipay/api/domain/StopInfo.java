package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 航班经停信息
 *
 * @author auto create
 * @since 1.0, 2023-09-21 09:50:17
 */
public class StopInfo extends AlipayObject {

	private static final long serialVersionUID = 8656629953182634942L;

	/**
	 * 经停机场三字码
	 */
	@ApiField("stop_airport")
	private String stopAirport;

	/**
	 * 经停机场名称
	 */
	@ApiField("stop_airport_name")
	private String stopAirportName;

	/**
	 * 经停城市三字码
	 */
	@ApiField("stop_city")
	private String stopCity;

	/**
	 * 经停城市名称
	 */
	@ApiField("stop_city_name")
	private String stopCityName;

	/**
	 * 经停时长，单位：s
	 */
	@ApiField("stop_time")
	private Long stopTime;

	public String getStopAirport() {
		return this.stopAirport;
	}
	public void setStopAirport(String stopAirport) {
		this.stopAirport = stopAirport;
	}

	public String getStopAirportName() {
		return this.stopAirportName;
	}
	public void setStopAirportName(String stopAirportName) {
		this.stopAirportName = stopAirportName;
	}

	public String getStopCity() {
		return this.stopCity;
	}
	public void setStopCity(String stopCity) {
		this.stopCity = stopCity;
	}

	public String getStopCityName() {
		return this.stopCityName;
	}
	public void setStopCityName(String stopCityName) {
		this.stopCityName = stopCityName;
	}

	public Long getStopTime() {
		return this.stopTime;
	}
	public void setStopTime(Long stopTime) {
		this.stopTime = stopTime;
	}

}
