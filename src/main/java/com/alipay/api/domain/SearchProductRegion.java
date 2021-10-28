package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索产品区域模型
 *
 * @author auto create
 * @since 1.0, 2021-07-12 16:45:53
 */
public class SearchProductRegion extends AlipayObject {

	private static final long serialVersionUID = 8625433388123679727L;

	/**
	 * 是否包含
	 */
	@ApiField("is_excluded")
	private String isExcluded;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 半径
	 */
	@ApiField("radius")
	private String radius;

	/**
	 * 区域编码
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 区域名称
	 */
	@ApiField("region_name")
	private String regionName;

	/**
	 * 区域类型（省、市、区县）
	 */
	@ApiField("region_type")
	private String regionType;

	public String getIsExcluded() {
		return this.isExcluded;
	}
	public void setIsExcluded(String isExcluded) {
		this.isExcluded = isExcluded;
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

	public String getRadius() {
		return this.radius;
	}
	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return this.regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionType() {
		return this.regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

}
