package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.gis.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:32
 */
public class AlipayOpenPublicGisQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6299541351239782598L;

	/** 
	 * 精确度
	 */
	@ApiField("accuracy")
	private String accuracy;

	/** 
	 * 经纬度所在位置
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 纬度信息
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 经度信息
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 经纬度对应位置所在的省份
	 */
	@ApiField("province")
	private String province;

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getAccuracy( ) {
		return this.accuracy;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

}
