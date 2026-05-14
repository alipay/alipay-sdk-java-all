package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 火车行程单信息
 *
 * @author auto create
 * @since 1.0, 2026-03-26 10:27:44
 */
public class InvoiceTrainItinerary extends AlipayObject {

	private static final long serialVersionUID = 3851864278958273843L;

	/**
	 * 出发站
	 */
	@ApiField("departure")
	private String departure;

	/**
	 * 出发时间，时间格式以实际返回为主
	 */
	@ApiField("departure_time")
	private String departureTime;

	/**
	 * 到达站
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 座位等级
	 */
	@ApiField("seat_class")
	private String seatClass;

	/**
	 * 座位号
	 */
	@ApiField("seat_no")
	private String seatNo;

	/**
	 * 列车号
	 */
	@ApiField("train_no")
	private String trainNo;

	public String getDeparture() {
		return this.departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
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

	public String getSeatClass() {
		return this.seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public String getSeatNo() {
		return this.seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getTrainNo() {
		return this.trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

}
