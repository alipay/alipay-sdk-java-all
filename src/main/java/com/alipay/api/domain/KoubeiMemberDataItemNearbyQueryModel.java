package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询附近优惠商品信息
 *
 * @author auto create
 * @since 1.0, 2019-06-28 18:01:30
 */
public class KoubeiMemberDataItemNearbyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7825883847884337487L;

	/**
	 * 城市编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private Long latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 分页数量，一页为3个，限制在1-20之间
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 分页开始索引,即获取的页数,初始页为0,后续透传返回的next_start即可
	 */
	@ApiField("page_start")
	private Long pageStart;

	/**
	 * 召回半径,单位为米,可以自行设置，向搜索请求时需要传入此参数获取附近商品
	 */
	@ApiField("radius")
	private Long radius;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Long getLatitude() {
		return this.latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return this.longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageStart() {
		return this.pageStart;
	}
	public void setPageStart(Long pageStart) {
		this.pageStart = pageStart;
	}

	public Long getRadius() {
		return this.radius;
	}
	public void setRadius(Long radius) {
		this.radius = radius;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
