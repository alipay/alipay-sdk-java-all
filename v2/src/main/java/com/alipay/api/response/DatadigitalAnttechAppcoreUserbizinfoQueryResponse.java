package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.appcore.userbizinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-22 14:22:05
 */
public class DatadigitalAnttechAppcoreUserbizinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6114883627212386127L;

	/** 
	 * 用户的供热信息，温度单位为摄氏度
	 */
	@ApiField("heat_data")
	private String heatData;

	/** 
	 * 用户供热卡信息，数据为热力公司的数据
	 */
	@ApiField("heat_list")
	private String heatList;

	public void setHeatData(String heatData) {
		this.heatData = heatData;
	}
	public String getHeatData( ) {
		return this.heatData;
	}

	public void setHeatList(String heatList) {
		this.heatList = heatList;
	}
	public String getHeatList( ) {
		return this.heatList;
	}

}
