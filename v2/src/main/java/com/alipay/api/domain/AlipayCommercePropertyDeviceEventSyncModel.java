package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门禁事件数据同步
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:32:41
 */
public class AlipayCommercePropertyDeviceEventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7157313277322763622L;

	/**
	 * 设备SN，唯一标识触发事件的门禁设备。
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 门禁事件发生的时间。若不传该值，默认取当前时间。
	 */
	@ApiField("event_time")
	private Date eventTime;

	/**
	 * 门禁设备产生的事件，如开门事件。
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 开门人手机的一个定位纬度，传递精度必须保留到小数点后6位。
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 定位时间
	 */
	@ApiField("location_time")
	private Date locationTime;

	/**
	 * 开门人手机的一个定位经度，传递精度必须保留到小数点后6位。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 支付宝uid，代表通过门禁的人。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝uid，代表通过门禁的人。
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public Date getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Date getLocationTime() {
		return this.locationTime;
	}
	public void setLocationTime(Date locationTime) {
		this.locationTime = locationTime;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
