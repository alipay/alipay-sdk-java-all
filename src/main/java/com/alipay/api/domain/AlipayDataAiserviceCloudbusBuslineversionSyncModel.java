package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全量公交路线版本同步1
 *
 * @author auto create
 * @since 1.0, 2019-08-13 13:03:38
 */
public class AlipayDataAiserviceCloudbusBuslineversionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1187425146728244294L;

	/**
	 * 接口版本号
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
	 * 公交线路总数
	 */
	@ApiField("route_num")
	private Long routeNum;

	/**
	 * 城市线路版本号
	 */
	@ApiField("route_version")
	private String routeVersion;

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

	public Long getRouteNum() {
		return this.routeNum;
	}
	public void setRouteNum(Long routeNum) {
		this.routeNum = routeNum;
	}

	public String getRouteVersion() {
		return this.routeVersion;
	}
	public void setRouteVersion(String routeVersion) {
		this.routeVersion = routeVersion;
	}

}
