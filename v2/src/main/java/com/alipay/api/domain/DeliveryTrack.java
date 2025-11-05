package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务物流轨迹
 *
 * @author auto create
 * @since 1.0, 2025-10-30 11:06:49
 */
public class DeliveryTrack extends AlipayObject {

	private static final long serialVersionUID = 3676538312837586754L;

	/**
	 * 预计送达时间段
	 */
	@ApiField("arrive_timeslot")
	private HealthServiceTimeslot arriveTimeslot;

	/**
	 * 配送员纬度
	 */
	@ApiField("courier_latitude")
	private String courierLatitude;

	/**
	 * 配送员经度
	 */
	@ApiField("courier_longitude")
	private String courierLongitude;

	/**
	 * 配送员姓名
	 */
	@ApiField("courier_name")
	private String courierName;

	/**
	 * 配送员电话
	 */
	@ApiField("courier_phone")
	private String courierPhone;

	/**
	 * 收货人纬度
	 */
	@ApiField("receiver_latitude")
	private String receiverLatitude;

	/**
	 * 收货人经度
	 */
	@ApiField("receiver_longitude")
	private String receiverLongitude;

	/**
	 * 剩余时间(分钟)
	 */
	@ApiField("remaining_delivery_minutes")
	private String remainingDeliveryMinutes;

	/**
	 * 剩余距离(km)
	 */
	@ApiField("remaining_distance_km")
	private String remainingDistanceKm;

	public HealthServiceTimeslot getArriveTimeslot() {
		return this.arriveTimeslot;
	}
	public void setArriveTimeslot(HealthServiceTimeslot arriveTimeslot) {
		this.arriveTimeslot = arriveTimeslot;
	}

	public String getCourierLatitude() {
		return this.courierLatitude;
	}
	public void setCourierLatitude(String courierLatitude) {
		this.courierLatitude = courierLatitude;
	}

	public String getCourierLongitude() {
		return this.courierLongitude;
	}
	public void setCourierLongitude(String courierLongitude) {
		this.courierLongitude = courierLongitude;
	}

	public String getCourierName() {
		return this.courierName;
	}
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierPhone() {
		return this.courierPhone;
	}
	public void setCourierPhone(String courierPhone) {
		this.courierPhone = courierPhone;
	}

	public String getReceiverLatitude() {
		return this.receiverLatitude;
	}
	public void setReceiverLatitude(String receiverLatitude) {
		this.receiverLatitude = receiverLatitude;
	}

	public String getReceiverLongitude() {
		return this.receiverLongitude;
	}
	public void setReceiverLongitude(String receiverLongitude) {
		this.receiverLongitude = receiverLongitude;
	}

	public String getRemainingDeliveryMinutes() {
		return this.remainingDeliveryMinutes;
	}
	public void setRemainingDeliveryMinutes(String remainingDeliveryMinutes) {
		this.remainingDeliveryMinutes = remainingDeliveryMinutes;
	}

	public String getRemainingDistanceKm() {
		return this.remainingDistanceKm;
	}
	public void setRemainingDistanceKm(String remainingDistanceKm) {
		this.remainingDistanceKm = remainingDistanceKm;
	}

}
