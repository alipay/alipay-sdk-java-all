package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城服服务用户属性同步接口
 *
 * @author auto create
 * @since 1.0, 2024-08-26 16:34:47
 */
public class AlipayEcoCityserviceUserPropertiesSendModel extends AlipayObject {

	private static final long serialVersionUID = 3416895893987564399L;

	/**
	 * 城市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 数据同步类型
	 */
	@ApiField("cud_type")
	private String cudType;

	/**
	 * 行业类型
	 */
	@ApiField("industry_type")
	private String industryType;

	/**
	 * 用户属性类型
	 */
	@ApiField("prop_type")
	private String propType;

	/**
	 * 用户属性值
	 */
	@ApiField("prop_value")
	private String propValue;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCudType() {
		return this.cudType;
	}
	public void setCudType(String cudType) {
		this.cudType = cudType;
	}

	public String getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getPropType() {
		return this.propType;
	}
	public void setPropType(String propType) {
		this.propType = propType;
	}

	public String getPropValue() {
		return this.propValue;
	}
	public void setPropValue(String propValue) {
		this.propValue = propValue;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
