package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线路指标对象
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:27
 */
public class RouteInfoObject extends AlipayObject {

	private static final long serialVersionUID = 8182196227734342675L;

	/**
	 * 衔接地铁情况,包含地铁信息
	 */
	@ApiField("connected_metro_route_information")
	private String connectedMetroRouteInformation;

	/**
	 * 运营统计信息
	 */
	@ApiField("operational_statistics")
	private String operationalStatistics;

	/**
	 * 优化建议传递
	 */
	@ApiField("optimization_recommendations")
	private String optimizationRecommendations;

	/**
	 * 线路基本信息
	 */
	@ApiField("route_basic_information")
	private String routeBasicInformation;

	/**
	 * 线路综合评价传递
	 */
	@ApiField("route_comprehensive_assessment")
	private String routeComprehensiveAssessment;

	/**
	 * 线路诊断数据传递
	 */
	@ApiField("route_diagnosis")
	private String routeDiagnosis;

	/**
	 * 线路名称
	 */
	@ApiField("route_name")
	private String routeName;

	/**
	 * 线路打分数据，良好[85, 100]
,中等[70, 85),一般[55，70),较差[0，55）
	 */
	@ApiField("route_score")
	private String routeScore;

	public String getConnectedMetroRouteInformation() {
		return this.connectedMetroRouteInformation;
	}
	public void setConnectedMetroRouteInformation(String connectedMetroRouteInformation) {
		this.connectedMetroRouteInformation = connectedMetroRouteInformation;
	}

	public String getOperationalStatistics() {
		return this.operationalStatistics;
	}
	public void setOperationalStatistics(String operationalStatistics) {
		this.operationalStatistics = operationalStatistics;
	}

	public String getOptimizationRecommendations() {
		return this.optimizationRecommendations;
	}
	public void setOptimizationRecommendations(String optimizationRecommendations) {
		this.optimizationRecommendations = optimizationRecommendations;
	}

	public String getRouteBasicInformation() {
		return this.routeBasicInformation;
	}
	public void setRouteBasicInformation(String routeBasicInformation) {
		this.routeBasicInformation = routeBasicInformation;
	}

	public String getRouteComprehensiveAssessment() {
		return this.routeComprehensiveAssessment;
	}
	public void setRouteComprehensiveAssessment(String routeComprehensiveAssessment) {
		this.routeComprehensiveAssessment = routeComprehensiveAssessment;
	}

	public String getRouteDiagnosis() {
		return this.routeDiagnosis;
	}
	public void setRouteDiagnosis(String routeDiagnosis) {
		this.routeDiagnosis = routeDiagnosis;
	}

	public String getRouteName() {
		return this.routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRouteScore() {
		return this.routeScore;
	}
	public void setRouteScore(String routeScore) {
		this.routeScore = routeScore;
	}

}
