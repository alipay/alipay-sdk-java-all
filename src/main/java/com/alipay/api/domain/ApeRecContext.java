package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐上下文
 *
 * @author auto create
 * @since 1.0, 2022-03-17 19:22:17
 */
public class ApeRecContext extends AlipayObject {

	private static final long serialVersionUID = 1376338451867753419L;

	/**
	 * 用户当前城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 客户端环境
	 */
	@ApiField("client_env")
	private String clientEnv;

	/**
	 * 用户设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 用户当前位置纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用户当前位置经度
	 */
	@ApiField("longitude")
	private String longitude;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getClientEnv() {
		return this.clientEnv;
	}
	public void setClientEnv(String clientEnv) {
		this.clientEnv = clientEnv;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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

}
