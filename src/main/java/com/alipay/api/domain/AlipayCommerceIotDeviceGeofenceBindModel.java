package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备与线路绑定接口
 *
 * @author auto create
 * @since 1.0, 2020-04-30 10:48:29
 */
public class AlipayCommerceIotDeviceGeofenceBindModel extends AlipayObject {

	private static final long serialVersionUID = 7635342273927979235L;

	/**
	 * 设备的唯一标识,设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 一组地理围栏的唯一标识, 通常一条公交线路.  一个设备只能绑定一条线路; 如果设备多次绑定线路, 以最新的线路为准; 如果不传route_code,表示将设备与现有线路解除绑定
	 */
	@ApiField("route_code")
	private String routeCode;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getRouteCode() {
		return this.routeCode;
	}
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

}
