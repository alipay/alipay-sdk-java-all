package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈信息
 *
 * @author auto create
 * @since 1.0, 2023-11-02 17:05:52
 */
public class BizAreaDTO extends AlipayObject {

	private static final long serialVersionUID = 8332533777126229592L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 商圈码
	 */
	@ApiField("biz_area_code")
	private String bizAreaCode;

	/**
	 * 商圈英文名称
	 */
	@ApiField("biz_area_english_name")
	private String bizAreaEnglishName;

	/**
	 * 商圈名称
	 */
	@ApiField("biz_area_name")
	private String bizAreaName;

	/**
	 * 商圈类型
	 */
	@ApiField("biz_area_type")
	private String bizAreaType;

	/**
	 * 版本
	 */
	@ApiField("biz_area_version")
	private Long bizAreaVersion;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 商圈围栏
	 */
	@ApiField("coords")
	private String coords;

	/**
	 * 国家
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 国家名
	 */
	@ApiField("country_name")
	private String countryName;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 包括标签，黑名单，图片。本次不包含经纬度了
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 全球眼商圈编码
	 */
	@ApiField("ge_biz_area_code")
	private String geBizAreaCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 商圈logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 花名加员工id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * VALID INVALID
	 */
	@ApiField("origin_flag")
	private String originFlag;

	/**
	 * 商店数量
	 */
	@ApiField("shop_count")
	private String shopCount;

	/**
	 * 商圈业务名称
	 */
	@ApiField("show_name")
	private String showName;

	/**
	 * ON OFF CONTROLLED_ON
	 */
	@ApiField("status")
	private String status;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBizAreaCode() {
		return this.bizAreaCode;
	}
	public void setBizAreaCode(String bizAreaCode) {
		this.bizAreaCode = bizAreaCode;
	}

	public String getBizAreaEnglishName() {
		return this.bizAreaEnglishName;
	}
	public void setBizAreaEnglishName(String bizAreaEnglishName) {
		this.bizAreaEnglishName = bizAreaEnglishName;
	}

	public String getBizAreaName() {
		return this.bizAreaName;
	}
	public void setBizAreaName(String bizAreaName) {
		this.bizAreaName = bizAreaName;
	}

	public String getBizAreaType() {
		return this.bizAreaType;
	}
	public void setBizAreaType(String bizAreaType) {
		this.bizAreaType = bizAreaType;
	}

	public Long getBizAreaVersion() {
		return this.bizAreaVersion;
	}
	public void setBizAreaVersion(Long bizAreaVersion) {
		this.bizAreaVersion = bizAreaVersion;
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

	public String getCoords() {
		return this.coords;
	}
	public void setCoords(String coords) {
		this.coords = coords;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGeBizAreaCode() {
		return this.geBizAreaCode;
	}
	public void setGeBizAreaCode(String geBizAreaCode) {
		this.geBizAreaCode = geBizAreaCode;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOriginFlag() {
		return this.originFlag;
	}
	public void setOriginFlag(String originFlag) {
		this.originFlag = originFlag;
	}

	public String getShopCount() {
		return this.shopCount;
	}
	public void setShopCount(String shopCount) {
		this.shopCount = shopCount;
	}

	public String getShowName() {
		return this.showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
