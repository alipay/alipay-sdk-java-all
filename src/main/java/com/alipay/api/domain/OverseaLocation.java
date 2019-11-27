package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 位置信息配置
 *
 * @author auto create
 * @since 1.0, 2019-08-19 13:58:42
 */
public class OverseaLocation extends AlipayObject {

	private static final long serialVersionUID = 8247863146655613518L;

	/**
	 * 蚂蚁LBS基础设施定义的城市码列表
	 */
	@ApiListField("city_codes")
	@ApiField("string")
	private List<String> cityCodes;

	/**
	 * ISO-3166标准三位数据国家码列表
	 */
	@ApiListField("country_codes")
	@ApiField("string")
	private List<String> countryCodes;

	/**
	 * 纬度，区间[-90,90]
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，区间[-180,180]
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 逆地理级别(按照lbs信息确认用户所在国家/城市)，可选值：
1. COUNTRY 
2. CITY
* 逆地理结果优先级低于入参的国家码/城市码
* 当入参没有传入国家码/城市码、且没有指定逆地理级别时，默认级别CITY
* 入参指定逆地理级别，但lbs信息不全时，接口报错
	 */
	@ApiField("reverse_lbs_scope")
	private String reverseLbsScope;

	public List<String> getCityCodes() {
		return this.cityCodes;
	}
	public void setCityCodes(List<String> cityCodes) {
		this.cityCodes = cityCodes;
	}

	public List<String> getCountryCodes() {
		return this.countryCodes;
	}
	public void setCountryCodes(List<String> countryCodes) {
		this.countryCodes = countryCodes;
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

	public String getReverseLbsScope() {
		return this.reverseLbsScope;
	}
	public void setReverseLbsScope(String reverseLbsScope) {
		this.reverseLbsScope = reverseLbsScope;
	}

}
