package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 负荷预测服务提交
 *
 * @author auto create
 * @since 1.0, 2025-08-11 10:21:20
 */
public class DatadigitalAnttechLoadForecastSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6576849693497621345L;

	/**
	 * 蚂蚁数科气象服务产品码，找蚂蚁数科运营同学获取
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 需要预测的时间点位，时间间隔一致，建议数量在history_date长度的1/3及以下
	 */
	@ApiListField("future_date")
	@ApiField("date")
	private List<Date> futureDate;

	/**
	 * 要求时间点连续，时间间隔一致。
时间长度最长支持21天。
	 */
	@ApiListField("history_date")
	@ApiField("date")
	private List<Date> historyDate;

	/**
	 * 负荷数据历史y值，要求与时间点按顺序一一对应。
单位无限制，与数值保持一致即可。
	 */
	@ApiListField("history_value")
	@ApiField("string")
	private List<String> historyValue;

	/**
	 * 业务请求ID，调用方需要确保唯一
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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
