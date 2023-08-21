package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车企token
 *
 * @author auto create
 * @since 1.0, 2022-11-01 16:38:45
 */
public class VehicleToken extends AlipayObject {

	private static final long serialVersionUID = 8155561634957767555L;

	/**
	 * 令牌有效时间戳
	 */
	@ApiField("expires_in_timestamp")
	private String expiresInTimestamp;

	/**
	 * 刷新令牌有效时间戳
	 */
	@ApiField("refresh_expires_in_timestamp")
	private String refreshExpiresInTimestamp;

	/**
	 * 车企访问token
	 */
	@ApiField("vehicle_access_token")
	private String vehicleAccessToken;

	/**
	 * 车企刷新token
	 */
	@ApiField("vehicle_refresh_token")
	private String vehicleRefreshToken;

	public String getExpiresInTimestamp() {
		return this.expiresInTimestamp;
	}
	public void setExpiresInTimestamp(String expiresInTimestamp) {
		this.expiresInTimestamp = expiresInTimestamp;
	}

	public String getRefreshExpiresInTimestamp() {
		return this.refreshExpiresInTimestamp;
	}
	public void setRefreshExpiresInTimestamp(String refreshExpiresInTimestamp) {
		this.refreshExpiresInTimestamp = refreshExpiresInTimestamp;
	}

	public String getVehicleAccessToken() {
		return this.vehicleAccessToken;
	}
	public void setVehicleAccessToken(String vehicleAccessToken) {
		this.vehicleAccessToken = vehicleAccessToken;
	}

	public String getVehicleRefreshToken() {
		return this.vehicleRefreshToken;
	}
	public void setVehicleRefreshToken(String vehicleRefreshToken) {
		this.vehicleRefreshToken = vehicleRefreshToken;
	}

}
