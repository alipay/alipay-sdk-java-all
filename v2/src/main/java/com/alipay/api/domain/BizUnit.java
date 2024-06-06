package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资讯归属主体
 *
 * @author auto create
 * @since 1.0, 2023-04-06 14:26:32
 */
public class BizUnit extends AlipayObject {

	private static final long serialVersionUID = 1313175454918112319L;

	/**
	 * 高德POIId
	 */
	@ApiField("amap_id")
	private String amapId;

	/**
	 * 详细地址
	 */
	@ApiField("biz_address")
	private String bizAddress;

	/**
	 * 城市code
	 */
	@ApiField("biz_city_code")
	private String bizCityCode;

	/**
	 * 城市名称
	 */
	@ApiField("biz_city_name")
	private String bizCityName;

	/**
	 * 纬度
	 */
	@ApiField("biz_latitude")
	private String bizLatitude;

	/**
	 * 经度
	 */
	@ApiField("biz_longitude")
	private String bizLongitude;

	/**
	 * 省份code
	 */
	@ApiField("biz_province_code")
	private String bizProvinceCode;

	/**
	 * 省份名称
	 */
	@ApiField("biz_province_name")
	private String bizProvinceName;

	/**
	 * 区县code
	 */
	@ApiField("biz_region_code")
	private String bizRegionCode;

	/**
	 * 区县名称
	 */
	@ApiField("biz_region_name")
	private String bizRegionName;

	/**
	 * 主体单元id，如社区id等
	 */
	@ApiField("biz_unit_id")
	private String bizUnitId;

	/**
	 * 主体单元名称，如社区名称
	 */
	@ApiField("biz_unit_name")
	private String bizUnitName;

	public String getAmapId() {
		return this.amapId;
	}
	public void setAmapId(String amapId) {
		this.amapId = amapId;
	}

	public String getBizAddress() {
		return this.bizAddress;
	}
	public void setBizAddress(String bizAddress) {
		this.bizAddress = bizAddress;
	}

	public String getBizCityCode() {
		return this.bizCityCode;
	}
	public void setBizCityCode(String bizCityCode) {
		this.bizCityCode = bizCityCode;
	}

	public String getBizCityName() {
		return this.bizCityName;
	}
	public void setBizCityName(String bizCityName) {
		this.bizCityName = bizCityName;
	}

	public String getBizLatitude() {
		return this.bizLatitude;
	}
	public void setBizLatitude(String bizLatitude) {
		this.bizLatitude = bizLatitude;
	}

	public String getBizLongitude() {
		return this.bizLongitude;
	}
	public void setBizLongitude(String bizLongitude) {
		this.bizLongitude = bizLongitude;
	}

	public String getBizProvinceCode() {
		return this.bizProvinceCode;
	}
	public void setBizProvinceCode(String bizProvinceCode) {
		this.bizProvinceCode = bizProvinceCode;
	}

	public String getBizProvinceName() {
		return this.bizProvinceName;
	}
	public void setBizProvinceName(String bizProvinceName) {
		this.bizProvinceName = bizProvinceName;
	}

	public String getBizRegionCode() {
		return this.bizRegionCode;
	}
	public void setBizRegionCode(String bizRegionCode) {
		this.bizRegionCode = bizRegionCode;
	}

	public String getBizRegionName() {
		return this.bizRegionName;
	}
	public void setBizRegionName(String bizRegionName) {
		this.bizRegionName = bizRegionName;
	}

	public String getBizUnitId() {
		return this.bizUnitId;
	}
	public void setBizUnitId(String bizUnitId) {
		this.bizUnitId = bizUnitId;
	}

	public String getBizUnitName() {
		return this.bizUnitName;
	}
	public void setBizUnitName(String bizUnitName) {
		this.bizUnitName = bizUnitName;
	}

}
