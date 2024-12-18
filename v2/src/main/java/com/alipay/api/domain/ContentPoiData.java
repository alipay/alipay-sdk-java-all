package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * POI信息
 *
 * @author auto create
 * @since 1.0, 2017-11-29 17:17:32
 */
public class ContentPoiData extends AlipayObject {

	private static final long serialVersionUID = 4645462172192347299L;

	/**
	 * poi纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * poi经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 位置信息
	 */
	@ApiField("poi_name")
	private String poiName;

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

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

}
