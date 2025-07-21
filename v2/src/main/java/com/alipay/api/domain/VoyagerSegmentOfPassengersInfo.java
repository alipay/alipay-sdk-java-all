package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager乘机人的航段信息
 *
 * @author auto create
 * @since 1.0, 2025-01-06 16:48:13
 */
public class VoyagerSegmentOfPassengersInfo extends AlipayObject {

	private static final long serialVersionUID = 2545222919566892718L;

	/**
	 * 三字码，例如：PEK
	 */
	@ApiField("arrive_airport_code")
	private String arriveAirportCode;

	/**
	 * 三字码，例如：TPE
	 */
	@ApiField("arrive_city_code")
	private String arriveCityCode;

	/**
	 * 到达航站楼
	 */
	@ApiField("arrive_terminal")
	private String arriveTerminal;

	/**
	 * 到达时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("arrive_time")
	private Date arriveTime;

	/**
	 * 舱等
Y:经济舱
S:超级经济舱
C:公务舱
F:头等舱
UNKOWN:未知
	 */
	@ApiField("cabin_class_code")
	private String cabinClassCode;

	/**
	 * 三字码，例如：PEK
	 */
	@ApiField("depart_airport_code")
	private String departAirportCode;

	/**
	 * 三字码，例如：TPE
	 */
	@ApiField("depart_city_code")
	private String departCityCode;

	/**
	 * 出发日期 格式：yyyy-MM-dd
	 */
	@ApiField("depart_date")
	private String departDate;

	/**
	 * 出发航站楼
	 */
	@ApiField("depart_terminal")
	private String departTerminal;

	/**
	 * 出发时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("depart_time")
	private Date departTime;

	/**
	 * FLIGHT_CHANGE(航变),
FLIGHT_CANCEL(取消),
REFUND(退票),
ORDER_CHANGE(改签)
	 */
	@ApiField("expire_reason")
	private String expireReason;

	/**
	 * 飞行时长(单位毫秒)
	 */
	@ApiField("flight_duration")
	private Long flightDuration;

	/**
	 * 航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 当前航段属于第几个行程（行程的顺序），从0开始
	 */
	@ApiField("journey_index")
	private Long journeyIndex;

	/**
	 * 乘机人姓名
	 */
	@ApiField("passenger_name")
	private String passengerName;

	/**
	 * 乘客类型
ADULT
CHILD
INFANT
	 */
	@ApiField("passenger_type")
	private String passengerType;

	/**
	 * 预订号
	 */
	@ApiField("pnr")
	private String pnr;

	/**
	 * 当前航段在所属行程中的顺序，从0开始
	 */
	@ApiField("segment_index")
	private Long segmentIndex;

	/**
	 * OUTBOUND(去程),
INBOUND(回程),
MULTIBOUND(多程);
	 */
	@ApiField("segment_type")
	private String segmentType;

	/**
	 * 乘客票号
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	public String getArriveAirportCode() {
		return this.arriveAirportCode;
	}
	public void setArriveAirportCode(String arriveAirportCode) {
		this.arriveAirportCode = arriveAirportCode;
	}

	public String getArriveCityCode() {
		return this.arriveCityCode;
	}
	public void setArriveCityCode(String arriveCityCode) {
		this.arriveCityCode = arriveCityCode;
	}

	public String getArriveTerminal() {
		return this.arriveTerminal;
	}
	public void setArriveTerminal(String arriveTerminal) {
		this.arriveTerminal = arriveTerminal;
	}

	public Date getArriveTime() {
		return this.arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getCabinClassCode() {
		return this.cabinClassCode;
	}
	public void setCabinClassCode(String cabinClassCode) {
		this.cabinClassCode = cabinClassCode;
	}

	public String getDepartAirportCode() {
		return this.departAirportCode;
	}
	public void setDepartAirportCode(String departAirportCode) {
		this.departAirportCode = departAirportCode;
	}

	public String getDepartCityCode() {
		return this.departCityCode;
	}
	public void setDepartCityCode(String departCityCode) {
		this.departCityCode = departCityCode;
	}

	public String getDepartDate() {
		return this.departDate;
	}
	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}

	public String getDepartTerminal() {
		return this.departTerminal;
	}
	public void setDepartTerminal(String departTerminal) {
		this.departTerminal = departTerminal;
	}

	public Date getDepartTime() {
		return this.departTime;
	}
	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}

	public String getExpireReason() {
		return this.expireReason;
	}
	public void setExpireReason(String expireReason) {
		this.expireReason = expireReason;
	}

	public Long getFlightDuration() {
		return this.flightDuration;
	}
	public void setFlightDuration(Long flightDuration) {
		this.flightDuration = flightDuration;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Long getJourneyIndex() {
		return this.journeyIndex;
	}
	public void setJourneyIndex(Long journeyIndex) {
		this.journeyIndex = journeyIndex;
	}

	public String getPassengerName() {
		return this.passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerType() {
		return this.passengerType;
	}
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getPnr() {
		return this.pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public Long getSegmentIndex() {
		return this.segmentIndex;
	}
	public void setSegmentIndex(Long segmentIndex) {
		this.segmentIndex = segmentIndex;
	}

	public String getSegmentType() {
		return this.segmentType;
	}
	public void setSegmentType(String segmentType) {
		this.segmentType = segmentType;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

}
