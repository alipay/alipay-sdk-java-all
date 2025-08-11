package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仓库模型
 *
 * @author auto create
 * @since 1.0, 2018-08-21 20:34:20
 */
public class WarehouseVO extends AlipayObject {

	private static final long serialVersionUID = 2338919974245325454L;

	/**
	 * 仓库详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 区域名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 仓库的状态，EFFECTIVE：生效，INVALID：失效。
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 菜鸟仓的编码
	 */
	@ApiField("cainiao_code")
	private String cainiaoCode;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 市的名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 联系人
	 */
	@ApiField("contact")
	private String contact;

	/**
	 * 维度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 归属人ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 联系方式
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 省的编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省的名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 对应的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 仓库名称
	 */
	@ApiField("warehouse_name")
	private String warehouseName;

	/**
	 * 仓库类型，REAL：实仓
	 */
	@ApiField("warehouse_type")
	private String warehouseType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getCainiaoCode() {
		return this.cainiaoCode;
	}
	public void setCainiaoCode(String cainiaoCode) {
		this.cainiaoCode = cainiaoCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getContact() {
		return this.contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseName() {
		return this.warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseType() {
		return this.warehouseType;
	}
	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

}
