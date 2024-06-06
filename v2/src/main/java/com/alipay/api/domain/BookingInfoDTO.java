package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店预订信息
 *
 * @author auto create
 * @since 1.0, 2024-02-28 14:02:17
 */
public class BookingInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3432875137588739175L;

	/**
	 * 预约入住时间
	 */
	@ApiField("booking_time")
	private String bookingTime;

	/**
	 * 入住日期
	 */
	@ApiField("check_in_date")
	private String checkInDate;

	/**
	 * 入住时间
	 */
	@ApiField("check_in_time")
	private String checkInTime;

	/**
	 * 离店日期
	 */
	@ApiField("check_out_date")
	private String checkOutDate;

	/**
	 * 离店时间
	 */
	@ApiField("check_out_time")
	private String checkOutTime;

	/**
	 * 商户确认买家的预约
	 */
	@ApiField("confirm_booking_time")
	private String confirmBookingTime;

	/**
	 * 客服电话，包含区号+电话号码的座机号码格式，以及手机号码格式。
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	/**
	 * 最晚到店时间
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 商户为买家办理续住的时间
	 */
	@ApiField("have_stay_time")
	private String haveStayTime;

	/**
	 * 退改规则
	 */
	@ApiField("refund_rule")
	private String refundRule;

	/**
	 * 入住酒店房间号
	 */
	@ApiField("room_num")
	private String roomNum;

	public String getBookingTime() {
		return this.bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getCheckInDate() {
		return this.checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckInTime() {
		return this.checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutDate() {
		return this.checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getCheckOutTime() {
		return this.checkOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public String getConfirmBookingTime() {
		return this.confirmBookingTime;
	}
	public void setConfirmBookingTime(String confirmBookingTime) {
		this.confirmBookingTime = confirmBookingTime;
	}

	public String getCustomerServiceMobile() {
		return this.customerServiceMobile;
	}
	public void setCustomerServiceMobile(String customerServiceMobile) {
		this.customerServiceMobile = customerServiceMobile;
	}

	public String getDeadline() {
		return this.deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getHaveStayTime() {
		return this.haveStayTime;
	}
	public void setHaveStayTime(String haveStayTime) {
		this.haveStayTime = haveStayTime;
	}

	public String getRefundRule() {
		return this.refundRule;
	}
	public void setRefundRule(String refundRule) {
		this.refundRule = refundRule;
	}

	public String getRoomNum() {
		return this.roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

}
