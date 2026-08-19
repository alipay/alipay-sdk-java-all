package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能源数据预测结果查询
 *
 * @author auto create
 * @since 1.0, 2026-08-14 16:52:50
 */
public class DatadigitalAnttechEnergyPredictionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6681715299411383721L;

	/**
	 * 蚂蚁数科服务产品码，找蚂蚁数科运营同学获取
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 预测类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 预测查询结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 预测对象，场站的就是场站id，电价就是
	 */
	@ApiField("forecast_id")
	private String forecastId;

	/**
	 * 请求 ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 预测查询开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getForecastId() {
		return this.forecastId;
	}
	public void setForecastId(String forecastId) {
		this.forecastId = forecastId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
