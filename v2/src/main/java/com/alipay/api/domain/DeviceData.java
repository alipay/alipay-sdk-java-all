package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-15 08:52:41
 */
public class DeviceData extends AlipayObject {

	private static final long serialVersionUID = 6128824349414694979L;

	/**
	 * 门禁所属小区编码
	 */
	@ApiField("community_code")
	private String communityCode;

	/**
	 * 门禁所属小区名称
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 设备SN，唯一标识某个门禁设备
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 门禁设备的来源，ISV表示三方服务商的门禁设备，ANT表示蚂蚁的门禁设备，默认为ISV
	 */
	@ApiField("device_source")
	private String deviceSource;

	/**
	 * 设备状态
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * 门禁设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 门禁设备的一个定位纬度，传递精度必须保留到小数点后6位。
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门禁设备的一个定位经度，传递精度必须保留到小数点后6位。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 线圈ID
	 */
	@ApiField("nfc_card_id")
	private String nfcCardId;

	/**
	 * 点位编码
	 */
	@ApiField("point_code")
	private String pointCode;

	/**
	 * 点位名称
	 */
	@ApiField("point_name")
	private String pointName;

	/**
	 * 门禁设备开门的响应时间，单位为毫秒(ms)
	 */
	@ApiField("response_time")
	private Long responseTime;

	public String getCommunityCode() {
		return this.communityCode;
	}
	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public String getCommunityName() {
		return this.communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceSource() {
		return this.deviceSource;
	}
	public void setDeviceSource(String deviceSource) {
		this.deviceSource = deviceSource;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getNfcCardId() {
		return this.nfcCardId;
	}
	public void setNfcCardId(String nfcCardId) {
		this.nfcCardId = nfcCardId;
	}

	public String getPointCode() {
		return this.pointCode;
	}
	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
	}

	public String getPointName() {
		return this.pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public Long getResponseTime() {
		return this.responseTime;
	}
	public void setResponseTime(Long responseTime) {
		this.responseTime = responseTime;
	}

}
