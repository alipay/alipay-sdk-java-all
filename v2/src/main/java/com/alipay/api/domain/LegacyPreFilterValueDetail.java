package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前置筛选值配置
 *
 * @author auto create
 * @since 1.0, 2025-09-05 16:57:38
 */
public class LegacyPreFilterValueDetail extends AlipayObject {

	private static final long serialVersionUID = 4383969253795192616L;

	/**
	 * 距离（仅地理坐标字段生效）
	 */
	@ApiField("distance")
	private LegacyPreFilterExtraValueDetail distance;

	/**
	 * 地理坐标（仅地理坐标字段生效）
	 */
	@ApiField("geo_point")
	private LegacyPreFilterExtraValueDetail geoPoint;

	/**
	 * 筛选值
	 */
	@ApiField("value")
	private LegacyPreFilterExtraValueDetail value;

	public LegacyPreFilterExtraValueDetail getDistance() {
		return this.distance;
	}
	public void setDistance(LegacyPreFilterExtraValueDetail distance) {
		this.distance = distance;
	}

	public LegacyPreFilterExtraValueDetail getGeoPoint() {
		return this.geoPoint;
	}
	public void setGeoPoint(LegacyPreFilterExtraValueDetail geoPoint) {
		this.geoPoint = geoPoint;
	}

	public LegacyPreFilterExtraValueDetail getValue() {
		return this.value;
	}
	public void setValue(LegacyPreFilterExtraValueDetail value) {
		this.value = value;
	}

}
