package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询地理围栏信息
 *
 * @author auto create
 * @since 1.0, 2021-01-13 19:16:14
 */
public class AlipayCommerceIotDeviceGeofenceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7618317632145798563L;

	/**
	 * 一组地理围栏的唯一标识, 通常一条公交线路.
	 */
	@ApiField("route_code")
	private String routeCode;

	public String getRouteCode() {
		return this.routeCode;
	}
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

}
