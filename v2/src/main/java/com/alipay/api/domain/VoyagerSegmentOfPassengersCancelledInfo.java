package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager机票人航段取消信息
 *
 * @author auto create
 * @since 1.0, 2025-01-06 16:48:13
 */
public class VoyagerSegmentOfPassengersCancelledInfo extends AlipayObject {

	private static final long serialVersionUID = 6416364177224618647L;

	/**
	 * 到达城市
	 */
	@ApiField("arrive_city_code")
	private String arriveCityCode;

	/**
	 * 出发城市
	 */
	@ApiField("depart_city_code")
	private String departCityCode;

	/**
	 * 出发时间 格式(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("depart_time")
	private Date departTime;

	/**
	 * 航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 乘机人姓名
	 */
	@ApiField("passenger_name")
	private String passengerName;

	public String getArriveCityCode() {
		return this.arriveCityCode;
	}
	public void setArriveCityCode(String arriveCityCode) {
		this.arriveCityCode = arriveCityCode;
	}

	public String getDepartCityCode() {
		return this.departCityCode;
	}
	public void setDepartCityCode(String departCityCode) {
		this.departCityCode = departCityCode;
	}

	public Date getDepartTime() {
		return this.departTime;
	}
	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getPassengerName() {
		return this.passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

}
