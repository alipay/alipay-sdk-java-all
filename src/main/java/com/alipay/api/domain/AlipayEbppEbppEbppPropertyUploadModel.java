package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步已开通物业缴费服务的小区到生活缴费
 *
 * @author auto create
 * @since 1.0, 2019-09-03 16:37:41
 */
public class AlipayEbppEbppEbppPropertyUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4697686947386883832L;

	/**
	 * 地级市级别国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 地级市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 小区主要详细地址，不需要包含省市区名称。
	 */
	@ApiField("community_address")
	private String communityAddress;

	/**
	 * 支付宝社区小区统一编号，由支付宝社区物业平台生成，每个小区确保唯一性。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 小区名称，最长不超过32个字符。
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 区县级国标码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 小区地理位置纬度（高德坐标系），经度小数点后不超过6位。
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 小区地理位置经度（高德坐标系），经度小数点后不超过6位。
	 */
	@ApiField("longtitude")
	private String longtitude;

	/**
	 * 小区操作，值为：
ONLINE - 上线
OFFLINE - 下线
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 小区在物业系统中的唯一编号，可选。
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 小区实际管理的物业公司名，用于在前台展示。
	 */
	@ApiField("property_company_name")
	private String propertyCompanyName;

	/**
	 * 服务提供方appid
	 */
	@ApiField("service_provider_appid")
	private String serviceProviderAppid;

	/**
	 * 跳转的H5缴费页URL
	 */
	@ApiField("service_url")
	private String serviceUrl;

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

	public String getCommunityAddress() {
		return this.communityAddress;
	}
	public void setCommunityAddress(String communityAddress) {
		this.communityAddress = communityAddress;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCommunityName() {
		return this.communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongtitude() {
		return this.longtitude;
	}
	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public String getPropertyCompanyName() {
		return this.propertyCompanyName;
	}
	public void setPropertyCompanyName(String propertyCompanyName) {
		this.propertyCompanyName = propertyCompanyName;
	}

	public String getServiceProviderAppid() {
		return this.serviceProviderAppid;
	}
	public void setServiceProviderAppid(String serviceProviderAppid) {
		this.serviceProviderAppid = serviceProviderAppid;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
