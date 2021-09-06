package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交客流走廊
 *
 * @author auto create
 * @since 1.0, 2021-04-19 18:42:50
 */
public class AlipayDataAiserviceCloudbusTransitorridorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5397516188513682267L;

	/**
	 * 接口版本控制
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 结束时间， 可空，空代表到最近一个月
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 起始月份，<空>代表最早一个月
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 枚举值。空（默认）：所有  0: 公共出行   1: 不包含地铁  2: 现有线网
	 */
	@ApiField("type")
	private String type;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
