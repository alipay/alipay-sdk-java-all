package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.gis.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-04 14:51:48
 */
public class AlipayMobilePublicGisGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6161346391428623634L;

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
	 * 结果码
	 */
	@ApiField("code")
	private String code;

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
	 * 结果信息
	 */
	@ApiField("msg")
	private String msg;

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

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
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

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

}
