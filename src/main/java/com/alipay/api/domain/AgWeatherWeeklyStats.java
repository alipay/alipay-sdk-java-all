package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农业气象周信息，包括降水、积温等
 *
 * @author auto create
 * @since 1.0, 2022-09-27 14:29:47
 */
public class AgWeatherWeeklyStats extends AlipayObject {

	private static final long serialVersionUID = 4146583935824947789L;

	/**
	 * 累计降水，单位mm*天
	 */
	@ApiField("acc_precipitation")
	private String accPrecipitation;

	/**
	 * 积温，单位摄氏度*天
	 */
	@ApiField("acc_temperature")
	private String accTemperature;

	/**
	 * 数据生产日期，YYYYMMDD
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 数据更新时间，YYYYMMDD
	 */
	@ApiField("update_date")
	private String updateDate;

	public String getAccPrecipitation() {
		return this.accPrecipitation;
	}
	public void setAccPrecipitation(String accPrecipitation) {
		this.accPrecipitation = accPrecipitation;
	}

	public String getAccTemperature() {
		return this.accTemperature;
	}
	public void setAccTemperature(String accTemperature) {
		this.accTemperature = accTemperature;
	}

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}
