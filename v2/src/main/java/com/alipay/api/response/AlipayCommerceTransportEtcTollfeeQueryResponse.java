package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EtcTollFeeTollStatsDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.tollfee.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-24 14:22:53
 */
public class AlipayCommerceTransportEtcTollfeeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6261673433358983664L;

	/** 
	 * 出站城市
	 */
	@ApiField("end_city")
	private String endCity;

	/** 
	 * 出口收费站名称
	 */
	@ApiField("end_station")
	private String endStation;

	/** 
	 * 进站城市
	 */
	@ApiField("start_city")
	private String startCity;

	/** 
	 * 起点收费站名称
	 */
	@ApiField("start_station")
	private String startStation;

	/** 
	 * 通行费统计
	 */
	@ApiField("toll_stats")
	private EtcTollFeeTollStatsDTO tollStats;

	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}
	public String getEndCity( ) {
		return this.endCity;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}
	public String getEndStation( ) {
		return this.endStation;
	}

	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}
	public String getStartCity( ) {
		return this.startCity;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getStartStation( ) {
		return this.startStation;
	}

	public void setTollStats(EtcTollFeeTollStatsDTO tollStats) {
		this.tollStats = tollStats;
	}
	public EtcTollFeeTollStatsDTO getTollStats( ) {
		return this.tollStats;
	}

}
