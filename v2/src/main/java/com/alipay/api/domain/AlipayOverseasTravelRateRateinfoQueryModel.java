package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * demo-跨境游单个汇率查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-14 10:48:01
 */
public class AlipayOverseasTravelRateRateinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2381883636283135162L;

	/**
	 * 用户当前所在国家的国家码，ISO-3166标准三位数字国家码。
1.currency、country_code、longitude&latitude三者不能同时为空；
2.同时存在时优先级：currency>country_code>longitude&latitude；
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 货币代码，ISO标准alpha-3币种代码
1.currency、country_code、longitude&latitude三者不能同时为空
2.同时存在时优先级：currency>country_code>longitude&latitude；
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 币种金额：不传的时候默认100，单位元
	 */
	@ApiField("currency_amount")
	private String currencyAmount;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 纬度；currency、country_code、longitude & latitude三者不能同时为空，同时存在时优先级：currency>country_code>longitude&latitude；
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度；
1.currency、country_code、longitude&latitude三者不能同时为空；
2.同时存在时优先级：currency>country_code>longitude&latitude；
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
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

	public String getCurrencyAmount() {
		return this.currencyAmount;
	}
	public void setCurrencyAmount(String currencyAmount) {
		this.currencyAmount = currencyAmount;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
