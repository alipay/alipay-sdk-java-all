package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager机票航变变更信息
 *
 * @author auto create
 * @since 1.0, 2025-01-06 16:48:13
 */
public class VoyagerSegmentOfPassengersChangedInfo extends AlipayObject {

	private static final long serialVersionUID = 1238234244721829185L;

	/**
	 * 到达机场是否变更
	 */
	@ApiField("arrive_airport_changed")
	private Boolean arriveAirportChanged;

	/**
	 * 到达时间是否变更
	 */
	@ApiField("arrive_time_changed")
	private Boolean arriveTimeChanged;

	/**
	 * 出发机场是否变更
	 */
	@ApiField("depart_airport_changed")
	private Boolean departAirportChanged;

	/**
	 * 出发时间是否变更
	 */
	@ApiField("depart_time_changed")
	private Boolean departTimeChanged;

	/**
	 * 航班号是否变更
	 */
	@ApiField("flight_no_changed")
	private Boolean flightNoChanged;

	/**
	 * 需要乘客确认座位
	 */
	@ApiField("need_confirm_seat")
	private Boolean needConfirmSeat;

	/**
	 * 三字码，例如：PEK
	 */
	@ApiField("new_arrive_airport_code")
	private String newArriveAirportCode;

	/**
	 * 三字码，例如：PEK
	 */
	@ApiField("new_depart_airport_code")
	private String newDepartAirportCode;

	/**
	 * 新出发时间 格式(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("new_depart_time")
	private Date newDepartTime;

	/**
	 * 新航班号
	 */
	@ApiField("new_flight_no")
	private String newFlightNo;

	/**
	 * 三字码，例如：PEK
	 */
	@ApiField("old_arrive_airport_code")
	private String oldArriveAirportCode;

	/**
	 * 三字码，例如：PEK
	 */
	@ApiField("old_depart_airport_code")
	private String oldDepartAirportCode;

	/**
	 * 原出发时间 格式(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("old_depart_time")
	private Date oldDepartTime;

	/**
	 * 原航班号
	 */
	@ApiField("old_flight_no")
	private String oldFlightNo;

	/**
	 * 乘机人姓名
	 */
	@ApiField("passenger_name")
	private String passengerName;

	public Boolean getArriveAirportChanged() {
		return this.arriveAirportChanged;
	}
	public void setArriveAirportChanged(Boolean arriveAirportChanged) {
		this.arriveAirportChanged = arriveAirportChanged;
	}

	public Boolean getArriveTimeChanged() {
		return this.arriveTimeChanged;
	}
	public void setArriveTimeChanged(Boolean arriveTimeChanged) {
		this.arriveTimeChanged = arriveTimeChanged;
	}

	public Boolean getDepartAirportChanged() {
		return this.departAirportChanged;
	}
	public void setDepartAirportChanged(Boolean departAirportChanged) {
		this.departAirportChanged = departAirportChanged;
	}

	public Boolean getDepartTimeChanged() {
		return this.departTimeChanged;
	}
	public void setDepartTimeChanged(Boolean departTimeChanged) {
		this.departTimeChanged = departTimeChanged;
	}

	public Boolean getFlightNoChanged() {
		return this.flightNoChanged;
	}
	public void setFlightNoChanged(Boolean flightNoChanged) {
		this.flightNoChanged = flightNoChanged;
	}

	public Boolean getNeedConfirmSeat() {
		return this.needConfirmSeat;
	}
	public void setNeedConfirmSeat(Boolean needConfirmSeat) {
		this.needConfirmSeat = needConfirmSeat;
	}

	public String getNewArriveAirportCode() {
		return this.newArriveAirportCode;
	}
	public void setNewArriveAirportCode(String newArriveAirportCode) {
		this.newArriveAirportCode = newArriveAirportCode;
	}

	public String getNewDepartAirportCode() {
		return this.newDepartAirportCode;
	}
	public void setNewDepartAirportCode(String newDepartAirportCode) {
		this.newDepartAirportCode = newDepartAirportCode;
	}

	public Date getNewDepartTime() {
		return this.newDepartTime;
	}
	public void setNewDepartTime(Date newDepartTime) {
		this.newDepartTime = newDepartTime;
	}

	public String getNewFlightNo() {
		return this.newFlightNo;
	}
	public void setNewFlightNo(String newFlightNo) {
		this.newFlightNo = newFlightNo;
	}

	public String getOldArriveAirportCode() {
		return this.oldArriveAirportCode;
	}
	public void setOldArriveAirportCode(String oldArriveAirportCode) {
		this.oldArriveAirportCode = oldArriveAirportCode;
	}

	public String getOldDepartAirportCode() {
		return this.oldDepartAirportCode;
	}
	public void setOldDepartAirportCode(String oldDepartAirportCode) {
		this.oldDepartAirportCode = oldDepartAirportCode;
	}

	public Date getOldDepartTime() {
		return this.oldDepartTime;
	}
	public void setOldDepartTime(Date oldDepartTime) {
		this.oldDepartTime = oldDepartTime;
	}

	public String getOldFlightNo() {
		return this.oldFlightNo;
	}
	public void setOldFlightNo(String oldFlightNo) {
		this.oldFlightNo = oldFlightNo;
	}

	public String getPassengerName() {
		return this.passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

}
