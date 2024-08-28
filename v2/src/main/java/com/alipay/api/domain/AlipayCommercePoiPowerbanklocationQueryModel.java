package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取附近充电宝点位
 *
 * @author auto create
 * @since 1.0, 2024-07-15 18:26:30
 */
public class AlipayCommercePoiPowerbanklocationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6171875397931344622L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext")
	private String ext;

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
	 * 半径范围
	 */
	@ApiField("radius_range")
	private String radiusRange;

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
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

	public String getRadiusRange() {
		return this.radiusRange;
	}
	public void setRadiusRange(String radiusRange) {
		this.radiusRange = radiusRange;
	}

}
