package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 影城列表
 *
 * @author auto create
 * @since 1.0, 2023-11-15 19:38:38
 */
public class CinemaList extends AlipayObject {

	private static final long serialVersionUID = 6232687418392384142L;

	/**
	 * 影城地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 影城编码
	 */
	@ApiField("cinema_code")
	private String cinemaCode;

	/**
	 * 离我当前的距离, 单位米
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 影城 id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 纬度(百度坐标)
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 优惠金额
	 */
	@ApiField("lowest_price")
	private String lowestPrice;

	/**
	 * 市场价格
	 */
	@ApiField("market_price")
	private String marketPrice;

	/**
	 * 排期时间列表
	 */
	@ApiListField("near_future")
	@ApiField("array_list")
	private List<ArrayList> nearFuture;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCinemaCode() {
		return this.cinemaCode;
	}
	public void setCinemaCode(String cinemaCode) {
		this.cinemaCode = cinemaCode;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public String getLowestPrice() {
		return this.lowestPrice;
	}
	public void setLowestPrice(String lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public String getMarketPrice() {
		return this.marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	public List<ArrayList> getNearFuture() {
		return this.nearFuture;
	}
	public void setNearFuture(List<ArrayList> nearFuture) {
		this.nearFuture = nearFuture;
	}

}
