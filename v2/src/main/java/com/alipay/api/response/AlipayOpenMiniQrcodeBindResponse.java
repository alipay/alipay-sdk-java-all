package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.qrcode.bind response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 13:13:13
 */
public class AlipayOpenMiniQrcodeBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5651547367832775197L;

	/** 
	 * 路由规则组，用于唯一标记一条路由规则
	 */
	@ApiField("route_group")
	private String routeGroup;

	public void setRouteGroup(String routeGroup) {
		this.routeGroup = routeGroup;
	}
	public String getRouteGroup( ) {
		return this.routeGroup;
	}

}
