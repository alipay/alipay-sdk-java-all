package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 气象预报查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-01 10:24:27
 */
public class AnttechBlockchainDefinDataserviceWeatherinfosQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8312937219751383411L;

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
