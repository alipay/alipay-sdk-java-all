package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 乘客出行数据信息，包含出行人信息、行程时间、OD名称等
 *
 * @author auto create
 * @since 1.0, 2026-05-27 13:50:33
 */
public class IndustryInvoicePassengerTransport extends AlipayObject {

	private static final long serialVersionUID = 1385348138669837163L;

	/**
	 * 旅客出发地
	 */
	@ApiField("departure")
	private String departure;

	/**
	 * 旅客到达地
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 有效身份证件号
	 */
	@ApiField("passenger_cert_no")
	private String passengerCertNo;

	/**
	 * 见枚举IndustryPassengerCertTypeEnum
	 */
	@ApiField("passenger_cert_type")
	private String passengerCertType;

	/**
	 * 乘客姓名
	 */
	@ApiField("passenger_name")
	private String passengerName;

	/**
	 * 当交通工具类型为飞机(AIR)/火车(TRAIN)/船舶(SHIP)时必填，交通工具为火车时可填：一等座，二等座，软席（软座、软卧），硬席（硬座、硬卧）；
交通工具为飞机时可填：公务舱，头等舱，经济舱；
交通工具为船舶 （不包括旅游船）时可填：一等舱，二等舱，三等舱；
其他交通工具可自定义座椅等级描述，不需要标注座椅等级时可填”无“；
	 */
	@ApiField("seat_class")
	private String seatClass;

	/**
	 * 从1开始，票面上支持多行按顺序渲染
	 */
	@ApiField("serial_no")
	private Long serialNo;

	/**
	 * 格式必须是"yyyy-MM-dd"
	 */
	@ApiField("travel_date")
	private String travelDate;

	/**
	 * 交通工具类型，目前仅支持出租车类型
	 */
	@ApiField("travel_method")
	private String travelMethod;

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

	public String getPassengerCertNo() {
		return this.passengerCertNo;
	}
	public void setPassengerCertNo(String passengerCertNo) {
		this.passengerCertNo = passengerCertNo;
	}

	public String getPassengerCertType() {
		return this.passengerCertType;
	}
	public void setPassengerCertType(String passengerCertType) {
		this.passengerCertType = passengerCertType;
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

	public Long getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(Long serialNo) {
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
