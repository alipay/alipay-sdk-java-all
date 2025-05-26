package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 气象预测查询服务
 *
 * @author auto create
 * @since 1.0, 2025-05-20 19:21:36
 */
public class DatadigitalAnttechWeatherHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1328577534751969677L;

	/**
	 * 蚂蚁数科气象服务产品码，找蚂蚁数科运营同学获取
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 查询气象的结束日期，忽略时分秒。
 结束日期 大于等于 开始日期。 
开始日期和结束日期间隔不能超过7天
	 */
	@ApiField("date_end")
	private Date dateEnd;

	/**
	 * 查询气象的开始日期，忽略时分秒。
结束日期 大于等于 开始日期。
开始日期和结束日期间隔不能超过7天
	 */
	@ApiField("date_start")
	private Date dateStart;

	/**
	 * 纬度，单位°
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，单位°
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 请求流水
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 8 - Asia/Shanghai （北京时间，UTC+8）
	 */
	@ApiField("timezone")
	private String timezone;

	/**
	 * 气象变量标记
	 */
	@ApiField("weather_variables_mark")
	private WeatherVariablesMark weatherVariablesMark;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Date getDateStart() {
		return this.dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTimezone() {
		return this.timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public WeatherVariablesMark getWeatherVariablesMark() {
		return this.weatherVariablesMark;
	}
	public void setWeatherVariablesMark(WeatherVariablesMark weatherVariablesMark) {
		this.weatherVariablesMark = weatherVariablesMark;
	}

}
