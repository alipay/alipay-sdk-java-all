package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址信息
 *
 * @author auto create
 * @since 1.0, 2018-11-29 20:18:37
 */
public class LocationInfo extends AlipayObject {

	private static final long serialVersionUID = 7362359841666143856L;

	/**
	 * 用户所处的经度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用户当前的纬度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 国家统一行政编码
	 */
	@ApiField("region_code")
	private String regionCode;

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

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

}
