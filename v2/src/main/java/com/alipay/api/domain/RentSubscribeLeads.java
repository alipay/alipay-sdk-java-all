package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房预约看房留咨消息
 *
 * @author auto create
 * @since 1.0, 2025-05-19 10:24:52
 */
public class RentSubscribeLeads extends AlipayObject {

	private static final long serialVersionUID = 5851791453913649958L;

	/**
	 * 约定看房日期
	 */
	@ApiField("appointment_date")
	private String appointmentDate;

	/**
	 * 约定看房时间段
	 */
	@ApiField("appointment_time")
	private String appointmentTime;

	/**
	 * 备注
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 租客手机号
	 */
	@ApiField("renter_mobile_num")
	private String renterMobileNum;

	/**
	 * 租客称呼
	 */
	@ApiField("renter_name")
	private String renterName;

	/**
	 * 商家侧房屋唯一编码
	 */
	@ApiField("room_code")
	private String roomCode;

	public String getAppointmentDate() {
		return this.appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return this.appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRenterMobileNum() {
		return this.renterMobileNum;
	}
	public void setRenterMobileNum(String renterMobileNum) {
		this.renterMobileNum = renterMobileNum;
	}

	public String getRenterName() {
		return this.renterName;
	}
	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}

	public String getRoomCode() {
		return this.roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

}
