package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店智慧住门店信息同步
 *
 * @author auto create
 * @since 1.0, 2025-09-12 09:57:39
 */
public class AlipayCommerceHotelLockerOrgSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6483991194578997632L;

	/**
	 * 支付宝组织唯一ID
,更新传入
	 */
	@ApiField("alipay_org_id")
	private String alipayOrgId;

	/**
	 * 所在区
	 */
	@ApiField("area")
	private String area;

	/**
	 * 区域码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 酒店品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 服务商侧酒店或学校唯一ID
	 */
	@ApiField("isv_org_id")
	private String isvOrgId;

	/**
	 * 坐标维度degrees
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 坐标经度degrees
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户入驻蚂蚁后获取的商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 数据集成服务商code
	 */
	@ApiField("operators_code")
	private String operatorsCode;

	/**
	 * 门店具体所在地址
	 */
	@ApiField("org_address")
	private String orgAddress;

	/**
	 * 集团code
	 */
	@ApiField("org_group_code")
	private String orgGroupCode;

	/**
	 * 具体门店的完整名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 所在省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 省份编码，按照省份证号码规则
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 场景类型：学校-SCHOOL，酒店-HOTEL
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 蚂蚁门店ID，如果是连锁模式，需要在蚂蚁商户下录入门店信息
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 联系电话
	 */
	@ApiField("telephone")
	private String telephone;

	public String getAlipayOrgId() {
		return this.alipayOrgId;
	}
	public void setAlipayOrgId(String alipayOrgId) {
		this.alipayOrgId = alipayOrgId;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getIsvOrgId() {
		return this.isvOrgId;
	}
	public void setIsvOrgId(String isvOrgId) {
		this.isvOrgId = isvOrgId;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOperatorsCode() {
		return this.operatorsCode;
	}
	public void setOperatorsCode(String operatorsCode) {
		this.operatorsCode = operatorsCode;
	}

	public String getOrgAddress() {
		return this.orgAddress;
	}
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getOrgGroupCode() {
		return this.orgGroupCode;
	}
	public void setOrgGroupCode(String orgGroupCode) {
		this.orgGroupCode = orgGroupCode;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
