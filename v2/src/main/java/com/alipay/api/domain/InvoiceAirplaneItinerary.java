package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 飞机行程单信息
 *
 * @author auto create
 * @since 1.0, 2026-03-26 10:27:44
 */
public class InvoiceAirplaneItinerary extends AlipayObject {

	private static final long serialVersionUID = 5712895341766743178L;

	/**
	 * 免费行李
	 */
	@ApiField("baggage")
	private String baggage;

	/**
	 * 承运人
	 */
	@ApiField("carrier")
	private String carrier;

	/**
	 * 出发地
	 */
	@ApiField("departure")
	private String departure;

	/**
	 * 出发日期，时间格式以实际返回为主
	 */
	@ApiField("departure_date")
	private String departureDate;

	/**
	 * 出发时间，时间格式以实际返回为主
	 */
	@ApiField("departure_time")
	private String departureTime;

	/**
	 * 到达地
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 客票有效截止日期，时间格式以实际返回为主
	 */
	@ApiField("expiry_date")
	private String expiryDate;

	/**
	 * 航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 客票类别
	 */
	@ApiField("passenger_class")
	private String passengerClass;

	/**
	 * 座位等级
	 */
	@ApiField("seat_class")
	private String seatClass;

	/**
	 * 客票生效日期，时间格式以实际返回为主
	 */
	@ApiField("valid_date")
	private String validDate;

	public String getBaggage() {
		return this.baggage;
	}
	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	public String getCarrier() {
		return this.carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getDeparture() {
		return this.departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDepartureDate() {
		return this.departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getExpiryDate() {
		return this.expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getPassengerClass() {
		return this.passengerClass;
	}
	public void setPassengerClass(String passengerClass) {
		this.passengerClass = passengerClass;
	}

	public String getSeatClass() {
		return this.seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public String getValidDate() {
		return this.validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
