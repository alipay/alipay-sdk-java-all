package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动态相关的地理位置
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class NewsfeedLocationInfo extends AlipayObject {

	private static final long serialVersionUID = 4244471981196696759L;

	/**
	 * 地理信息
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 纬度 latitude（填写非0非1）
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度 longitude（填写非0非1）
	 */
	@ApiField("lon")
	private String lon;

	public String getAdCode() {
		return this.adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}

}
