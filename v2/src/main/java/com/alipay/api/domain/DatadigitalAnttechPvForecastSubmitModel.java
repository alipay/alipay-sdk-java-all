package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 光伏预测服务
 *
 * @author auto create
 * @since 1.0, 2025-08-11 14:04:42
 */
public class DatadigitalAnttechPvForecastSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4815245635589532537L;

	/**
	 * 蚂蚁数科气象服务产品码，找蚂蚁数科运营同学获取
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 需要预测的时间点位，频率为15min
建议长度在history_date长度的1/3及以下
由于气象数据限制，最大长度限制在14天
	 */
	@ApiListField("future_date")
	@ApiField("date")
	private List<Date> futureDate;

	/**
	 * 要求时间点连续，频率必须为15min
	 */
	@ApiListField("history_date")
	@ApiField("date")
	private List<Date> historyDate;

	/**
	 * 要求与时间点按顺序一一对应
	 */
	@ApiListField("history_value")
	@ApiField("string")
	private List<String> historyValue;

	/**
	 * 纬度，单位°
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，单位 °
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 请求 ID
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	public List<Date> getFutureDate() {
		return this.futureDate;
	}
	public void setFutureDate(List<Date> futureDate) {
		this.futureDate = futureDate;
	}

	public List<Date> getHistoryDate() {
		return this.historyDate;
	}
	public void setHistoryDate(List<Date> historyDate) {
		this.historyDate = historyDate;
	}

	public List<String> getHistoryValue() {
		return this.historyValue;
	}
	public void setHistoryValue(List<String> historyValue) {
		this.historyValue = historyValue;
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

}
