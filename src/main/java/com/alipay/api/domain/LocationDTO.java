package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定位
 *
 * @author auto create
 * @since 1.0, 2022-07-01 17:28:09
 */
public class LocationDTO extends AlipayObject {

	private static final long serialVersionUID = 5426718994954798372L;

	/**
	 * 所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 使用设备的IMEI号
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 使用设备的IMSI号
	 */
	@ApiField("imsi")
	private String imsi;

	/**
	 * 使用设备的IP地址
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 使用设备的Wi-Fi物理地址
	 */
	@ApiField("mac_addr")
	private String macAddr;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return this.imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
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

	public String getMacAddr() {
		return this.macAddr;
	}
	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}

}
