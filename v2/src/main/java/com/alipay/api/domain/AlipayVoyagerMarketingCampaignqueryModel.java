package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager营销活动咨询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class AlipayVoyagerMarketingCampaignqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1132637618818326124L;

	/**
	 * 城市码和国家码都可以
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 国家码
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 环境信息
	 */
	@ApiField("env_info")
	private VoyagerEnvInfo envInfo;

	/**
	 * 扩展信息（Map 的 JSON string）
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 多语言
	 */
	@ApiField("locale")
	private String locale;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 投放流量位ID
	 */
	@ApiField("polymer_block_code")
	private String polymerBlockCode;

	/**
	 * 用户userid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public VoyagerEnvInfo getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(VoyagerEnvInfo envInfo) {
		this.envInfo = envInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocale() {
		return this.locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPolymerBlockCode() {
		return this.polymerBlockCode;
	}
	public void setPolymerBlockCode(String polymerBlockCode) {
		this.polymerBlockCode = polymerBlockCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
