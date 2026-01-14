package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.miniappstatic.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:07:37
 */
public class AlipayDataMdaMiniappstaticQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2668924257946286625L;

	/** 
	 * 住宿
	 */
	@ApiField("accommodation")
	private String accommodation;

	/** 
	 * 美食
	 */
	@ApiField("fine_food")
	private String fineFood;

	/** 
	 * 了解亚运
	 */
	@ApiField("focus_ag")
	private String focusAg;

	/** 
	 * 多语言版
	 */
	@ApiField("language_version")
	private String languageVersion;

	/** 
	 * 一码出行
	 */
	@ApiField("one_yard_trip")
	private String oneYardTrip;

	/** 
	 * 景点
	 */
	@ApiField("scenic_spot")
	private String scenicSpot;

	/** 
	 * 服务场景
	 */
	@ApiField("service_scenario")
	private Long serviceScenario;

	/** 
	 * 服务场景词云图
	 */
	@ApiField("service_scenario_map")
	private String serviceScenarioMap;

	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}
	public String getAccommodation( ) {
		return this.accommodation;
	}

	public void setFineFood(String fineFood) {
		this.fineFood = fineFood;
	}
	public String getFineFood( ) {
		return this.fineFood;
	}

	public void setFocusAg(String focusAg) {
		this.focusAg = focusAg;
	}
	public String getFocusAg( ) {
		return this.focusAg;
	}

	public void setLanguageVersion(String languageVersion) {
		this.languageVersion = languageVersion;
	}
	public String getLanguageVersion( ) {
		return this.languageVersion;
	}

	public void setOneYardTrip(String oneYardTrip) {
		this.oneYardTrip = oneYardTrip;
	}
	public String getOneYardTrip( ) {
		return this.oneYardTrip;
	}

	public void setScenicSpot(String scenicSpot) {
		this.scenicSpot = scenicSpot;
	}
	public String getScenicSpot( ) {
		return this.scenicSpot;
	}

	public void setServiceScenario(Long serviceScenario) {
		this.serviceScenario = serviceScenario;
	}
	public Long getServiceScenario( ) {
		return this.serviceScenario;
	}

	public void setServiceScenarioMap(String serviceScenarioMap) {
		this.serviceScenarioMap = serviceScenarioMap;
	}
	public String getServiceScenarioMap( ) {
		return this.serviceScenarioMap;
	}

}
