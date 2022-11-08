package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地址元素
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:40:50
 */
public class Addresscomponent extends AlipayObject {

	private static final long serialVersionUID = 6153816774211919186L;

	/**
	 * 行政区编码
	 */
	@ApiField("adcode")
	private String adcode;

	/**
	 * 建筑信息
	 */
	@ApiField("building")
	private Building building;

	/**
	 * 商圈信息列表
	 */
	@ApiListField("business_areas")
	@ApiField("businessarea")
	private List<Businessarea> businessAreas;

	/**
	 * 当所在城市为北京、上海、天津、重庆四个直辖市时，该字段返回为空。当所在城市属于县级市的时候，此字段为空。
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市编码
	 */
	@ApiField("citycode")
	private String citycode;

	/**
	 * 国内默认返回中国
	 */
	@ApiField("country")
	private String country;

	/**
	 * 坐标点所在区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 社区信息
	 */
	@ApiField("neighborhood")
	private Neighborhood neighborhood;

	/**
	 * 坐标点所在省名称
	 */
	@ApiField("province")
	private String province;

	/**
	 * 门牌信息
	 */
	@ApiField("street_number")
	private Streetnumber streetNumber;

	/**
	 * 乡镇街道编码
	 */
	@ApiField("towncode")
	private String towncode;

	/**
	 * 坐标点所在乡镇/街道（此街道为社区街道，不是道路信息）
	 */
	@ApiField("township")
	private String township;

	public String getAdcode() {
		return this.adcode;
	}
	public void setAdcode(String adcode) {
		this.adcode = adcode;
	}

	public Building getBuilding() {
		return this.building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}

	public List<Businessarea> getBusinessAreas() {
		return this.businessAreas;
	}
	public void setBusinessAreas(List<Businessarea> businessAreas) {
		this.businessAreas = businessAreas;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCitycode() {
		return this.citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public Neighborhood getNeighborhood() {
		return this.neighborhood;
	}
	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public Streetnumber getStreetNumber() {
		return this.streetNumber;
	}
	public void setStreetNumber(Streetnumber streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getTowncode() {
		return this.towncode;
	}
	public void setTowncode(String towncode) {
		this.towncode = towncode;
	}

	public String getTownship() {
		return this.township;
	}
	public void setTownship(String township) {
		this.township = township;
	}

}
