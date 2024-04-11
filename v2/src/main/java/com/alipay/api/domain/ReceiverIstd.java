package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收件人
 *
 * @author auto create
 * @since 1.0, 2023-02-17 11:47:42
 */
public class ReceiverIstd extends AlipayObject {

	private static final long serialVersionUID = 5787875949257222985L;

	/**
	 * 地址(街道、小区、大厦等，用于定位)
	 */
	@ApiField("address")
	private String address;

	/**
	 * 地址详情(楼号、单元号、层号)
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 城市名称，如杭州市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 坐标类型，0：火星坐标（高德，腾讯地图均采用火星坐标） 1：百度坐标。目前只支持0:火星坐标
	 */
	@ApiField("coordinate_type")
	private Long coordinateType;

	/**
	 * 纬度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度
	 */
	@ApiField("lng")
	private String lng;

	/**
	 * 手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressDetail() {
		return this.addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Long getCoordinateType() {
		return this.coordinateType;
	}
	public void setCoordinateType(Long coordinateType) {
		this.coordinateType = coordinateType;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return this.lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
