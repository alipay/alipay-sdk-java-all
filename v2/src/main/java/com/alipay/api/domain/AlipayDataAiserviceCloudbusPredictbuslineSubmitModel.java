package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公交路线预测接口1
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:38:17
 */
public class AlipayDataAiserviceCloudbusPredictbuslineSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5336457812863972744L;

	/**
	 * 接口版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 公交线路版本号
	 */
	@ApiField("route_version")
	private String routeVersion;

	/**
	 * 客流预测公交线路列表
	 */
	@ApiListField("routes")
	@ApiField("cloudbus_route")
	private List<CloudbusRoute> routes;

	/**
	 * 客流预测任务描述
	 */
	@ApiField("title")
	private String title;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRouteVersion() {
		return this.routeVersion;
	}
	public void setRouteVersion(String routeVersion) {
		this.routeVersion = routeVersion;
	}

	public List<CloudbusRoute> getRoutes() {
		return this.routes;
	}
	public void setRoutes(List<CloudbusRoute> routes) {
		this.routes = routes;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
