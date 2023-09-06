package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能排班接入外部租户预测数据
 *
 * @author auto create
 * @since 1.0, 2022-12-09 11:14:08
 */
public class AlipayIserviceIdeployForcecastCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6526999621242172883L;

	/**
	 * 预测数据
	 */
	@ApiField("forecast_data")
	private IdeployForecastData forecastData;

	/**
	 * 租户CODE
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public IdeployForecastData getForecastData() {
		return this.forecastData;
	}
	public void setForecastData(IdeployForecastData forecastData) {
		this.forecastData = forecastData;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
