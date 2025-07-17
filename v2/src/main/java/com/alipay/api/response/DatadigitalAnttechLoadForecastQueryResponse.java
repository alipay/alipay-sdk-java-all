package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnergyForecastInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.load.forecast.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-27 16:45:44
 */
public class DatadigitalAnttechLoadForecastQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7125768781247879192L;

	/** 
	 * 负荷预测数据信息
	 */
	@ApiListField("data")
	@ApiField("energy_forecast_info")
	private List<EnergyForecastInfo> data;

	/** 
	 * 消耗的token数量。
	 */
	@ApiField("quota_cost")
	private String quotaCost;

	public void setData(List<EnergyForecastInfo> data) {
		this.data = data;
	}
	public List<EnergyForecastInfo> getData( ) {
		return this.data;
	}

	public void setQuotaCost(String quotaCost) {
		this.quotaCost = quotaCost;
	}
	public String getQuotaCost( ) {
		return this.quotaCost;
	}

}
