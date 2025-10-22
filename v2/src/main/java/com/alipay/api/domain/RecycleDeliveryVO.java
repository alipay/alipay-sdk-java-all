package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 *  回收履约信息
 *
 * @author auto create
 * @since 1.0, 2025-07-23 11:12:35
 */
public class RecycleDeliveryVO extends AlipayObject {

	private static final long serialVersionUID = 5369114641545443898L;

	/**
	 * 实际取件时间
	 */
	@ApiField("actual_time")
	private String actualTime;

	/**
	 * INIT：待分配 ；ASSIGNED:已分配小二；TRAVELING：运输中；FINISHED：已完成
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/**
	 * EXPRESS商家邮寄;DOOR_TO_DOOR工程师上门;USER_EXPRESS自寄;TO_STORE到店
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 预约结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 物流彪马
	 */
	@ApiField("logistic_bill_no")
	private String logisticBillNo;

	/**
	 * 物流公司
	 */
	@ApiField("logistic_platform")
	private String logisticPlatform;

	/**
	 * 小哥联系方式
	 */
	@ApiField("staff_phone")
	private String staffPhone;

	/**
	 * 预约开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 用户不卖了的收货地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 用户联系方式
	 */
	@ApiField("user_phone")
	private String userPhone;

	public String getActualTime() {
		return this.actualTime;
	}
	public void setActualTime(String actualTime) {
		this.actualTime = actualTime;
	}

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getLogisticBillNo() {
		return this.logisticBillNo;
	}
	public void setLogisticBillNo(String logisticBillNo) {
		this.logisticBillNo = logisticBillNo;
	}

	public String getLogisticPlatform() {
		return this.logisticPlatform;
	}
	public void setLogisticPlatform(String logisticPlatform) {
		this.logisticPlatform = logisticPlatform;
	}

	public String getStaffPhone() {
		return this.staffPhone;
	}
	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUserAddress() {
		return this.userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
