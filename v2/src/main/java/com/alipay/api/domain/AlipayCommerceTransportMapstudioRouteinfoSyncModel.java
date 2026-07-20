package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公交线路指标信息同步
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:27
 */
public class AlipayCommerceTransportMapstudioRouteinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2595687886648256748L;

	/**
	 * 城市区域编码，例如：南京320100
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 线路相关信息
	 */
	@ApiListField("route_info_details")
	@ApiField("route_info_object")
	private List<RouteInfoObject> routeInfoDetails;

	/**
	 * 线路打分月份，格式 YYYYMM，如 "202509"
	 */
	@ApiField("route_score_month")
	private String routeScoreMonth;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<RouteInfoObject> getRouteInfoDetails() {
		return this.routeInfoDetails;
	}
	public void setRouteInfoDetails(List<RouteInfoObject> routeInfoDetails) {
		this.routeInfoDetails = routeInfoDetails;
	}

	public String getRouteScoreMonth() {
		return this.routeScoreMonth;
	}
	public void setRouteScoreMonth(String routeScoreMonth) {
		this.routeScoreMonth = routeScoreMonth;
	}

}
