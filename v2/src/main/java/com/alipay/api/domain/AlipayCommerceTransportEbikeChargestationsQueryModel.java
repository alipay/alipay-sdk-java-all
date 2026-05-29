package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 两轮充电桩列表查询
 *
 * @author auto create
 * @since 1.0, 2026-05-27 15:24:06
 */
public class AlipayCommerceTransportEbikeChargestationsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5133322861247751572L;

	/**
	 * 城市编码,高德标准
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 合作方编码
	 */
	@ApiField("partner_code")
	private String partnerCode;

	/**
	 * 搜索经纬度,高德坐标系
	 */
	@ApiField("search_location")
	private LocationParam searchLocation;

	/**
	 * 搜索半径，单位：km,
99999是上限，每个合作方上限根据配置有所不同
	 */
	@ApiField("search_radius")
	private Long searchRadius;

	/**
	 * 用户定位经纬度，高德坐标系
	 */
	@ApiField("user_location")
	private LocationParam userLocation;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	public LocationParam getSearchLocation() {
		return this.searchLocation;
	}
	public void setSearchLocation(LocationParam searchLocation) {
		this.searchLocation = searchLocation;
	}

	public Long getSearchRadius() {
		return this.searchRadius;
	}
	public void setSearchRadius(Long searchRadius) {
		this.searchRadius = searchRadius;
	}

	public LocationParam getUserLocation() {
		return this.userLocation;
	}
	public void setUserLocation(LocationParam userLocation) {
		this.userLocation = userLocation;
	}

}
