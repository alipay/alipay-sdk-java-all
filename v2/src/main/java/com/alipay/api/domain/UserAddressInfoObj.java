package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户地址信息
 *
 * @author auto create
 * @since 1.0, 2024-11-01 14:14:13
 */
public class UserAddressInfoObj extends AlipayObject {

	private static final long serialVersionUID = 6627873286676727844L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 当同一类型地址在数组中时（如拉货服务多个途经点地址），用来标明地址顺序
	 */
	@ApiField("address_order")
	private String addressOrder;

	/**
	 * 区/县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 楼梯层数
	 */
	@ApiField("floor_height")
	private String floorHeight;

	/**
	 * 楼梯类型
	 */
	@ApiField("floor_type")
	private String floorType;

	/**
	 * 门牌号
	 */
	@ApiField("house_number")
	private String houseNumber;

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
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * poi地点名称
	 */
	@ApiField("poi_name")
	private String poiName;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressOrder() {
		return this.addressOrder;
	}
	public void setAddressOrder(String addressOrder) {
		this.addressOrder = addressOrder;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getFloorHeight() {
		return this.floorHeight;
	}
	public void setFloorHeight(String floorHeight) {
		this.floorHeight = floorHeight;
	}

	public String getFloorType() {
		return this.floorType;
	}
	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public String getHouseNumber() {
		return this.houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
