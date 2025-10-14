package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游汇率查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-29 14:49:20
 */
public class AlipayOverseasTravelRateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4439337297548466136L;

	/**
	 * 用户当前所在国家的国家码，ISO-3166标准三位数字国家码，currency、countryCode、longitude & latitude三者不能同时为空
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 货币代码，ISO标准alpha- 3币种代码，currency、countryCode、longitude & latitude三者不能同时为空
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 业务扩展参数,用于商户的特定业务信息的传递,json格式
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 用户当前定位纬度，currency、countryCode、longitude & latitude三者不能同时为空
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用户当前定位经度，currency、countryCode、longitude & latitude三者不能同时为空
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 蚂蚁统一会员ID，唯一，如有该字段，可以获取该币种对应会员等级的汇率
	 */
	@ApiField("user_id")
	private String userId;

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
