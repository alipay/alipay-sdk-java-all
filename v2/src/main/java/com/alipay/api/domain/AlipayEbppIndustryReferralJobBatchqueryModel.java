package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐官岗位批量查询
 *
 * @author auto create
 * @since 1.0, 2026-06-26 16:09:45
 */
public class AlipayEbppIndustryReferralJobBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3134891512473269571L;

	/**
	 * 城市区县编码，六位精确匹配
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 距离过滤范围，单位：米，最远10km
	 */
	@ApiField("distance_range")
	private Long distanceRange;

	/**
	 * 高德系纬度，经纬度和城市编码同时不传不返回数据
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 高德系经度，配合latitude和distance_range做距离过滤
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量，默认10，最大20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 推荐官注册后获取的ID
	 */
	@ApiField("recommender_id")
	private String recommenderId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Long getDistanceRange() {
		return this.distanceRange;
	}
	public void setDistanceRange(Long distanceRange) {
		this.distanceRange = distanceRange;
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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRecommenderId() {
		return this.recommenderId;
	}
	public void setRecommenderId(String recommenderId) {
		this.recommenderId = recommenderId;
	}

}
