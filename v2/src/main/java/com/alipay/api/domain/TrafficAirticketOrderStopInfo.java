package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行机票订单数据同步-经停信息
 *
 * @author auto create
 * @since 1.0, 2024-09-26 20:34:18
 */
public class TrafficAirticketOrderStopInfo extends AlipayObject {

	private static final long serialVersionUID = 6499227377978225518L;

	/**
	 * 经停机场三字码
	 */
	@ApiField("stop_airport_code")
	private String stopAirportCode;

	/**
	 * 经停机场名称
	 */
	@ApiField("stop_airport_name")
	private String stopAirportName;

	/**
	 * 经停降落时间
	 */
	@ApiField("stop_arr_time")
	private Date stopArrTime;

	/**
	 * 经停城市三字码
	 */
	@ApiField("stop_city_code")
	private String stopCityCode;

	/**
	 * 经停城市名称
	 */
	@ApiField("stop_city_name")
	private String stopCityName;

	/**
	 * 经停起飞时间
	 */
	@ApiField("stop_dep_time")
	private Date stopDepTime;

	/**
	 * 经停时间，单位秒
	 */
	@ApiField("stop_time")
	private Long stopTime;

	public String getStopAirportCode() {
		return this.stopAirportCode;
	}
	public void setStopAirportCode(String stopAirportCode) {
		this.stopAirportCode = stopAirportCode;
	}

	public String getStopAirportName() {
		return this.stopAirportName;
	}
	public void setStopAirportName(String stopAirportName) {
		this.stopAirportName = stopAirportName;
	}

	public Date getStopArrTime() {
		return this.stopArrTime;
	}
	public void setStopArrTime(Date stopArrTime) {
		this.stopArrTime = stopArrTime;
	}

	public String getStopCityCode() {
		return this.stopCityCode;
	}
	public void setStopCityCode(String stopCityCode) {
		this.stopCityCode = stopCityCode;
	}

	public String getStopCityName() {
		return this.stopCityName;
	}
	public void setStopCityName(String stopCityName) {
		this.stopCityName = stopCityName;
	}

	public Date getStopDepTime() {
		return this.stopDepTime;
	}
	public void setStopDepTime(Date stopDepTime) {
		this.stopDepTime = stopDepTime;
	}

	public Long getStopTime() {
		return this.stopTime;
	}
	public void setStopTime(Long stopTime) {
		this.stopTime = stopTime;
	}

}
