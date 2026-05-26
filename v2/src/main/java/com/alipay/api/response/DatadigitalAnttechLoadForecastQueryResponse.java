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
 * @since 1.0, 2026-02-28 16:27:50
 */
public class DatadigitalAnttechLoadForecastQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5679351263942221833L;

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
