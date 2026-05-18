package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-26 10:27:44
 */
public class InvoicePassenger extends AlipayObject {

	private static final long serialVersionUID = 8188361339355778479L;

	/**
	 * 出行人身份证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 出发地
	 */
	@ApiField("departure")
	private String departure;

	/**
	 * 到达地
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 出行人姓名
	 */
	@ApiField("passenger_name")
	private String passengerName;

	/**
	 * 交通工具为 火车时: 一等座 二等座 软席(软座、 软卧) 硬席(硬座、 硬卧) 交通工作为 飞机时: 公务舱 头等舱 经济舱 交通工具为 船舶(不包括 旅游船) 时: 一等舱 二等舱 三等舱
	 */
	@ApiField("seat_class")
	private String seatClass;

	/**
	 * 序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 出行日期,时间格式以实际返回为主
	 */
	@ApiField("travel_date")
	private String travelDate;

	/**
	 * 交通方式
	 */
	@ApiField("travel_method")
	private String travelMethod;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getDeparture() {
		return this.departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPassengerName() {
		return this.passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getSeatClass() {
		return this.seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getTravelDate() {
		return this.travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public String getTravelMethod() {
		return this.travelMethod;
	}
	public void setTravelMethod(String travelMethod) {
		this.travelMethod = travelMethod;
	}

}
