package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RouteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.customroute.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 16:32:10
 */
public class AlipayCloudCloudpromoCustomrouteCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6223376917481334564L;

	/** 
	 * 伴游卡片唯一id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 伴游路线列表
	 */
	@ApiListField("routes")
	@ApiField("route_info")
	private List<RouteInfo> routes;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setRoutes(List<RouteInfo> routes) {
		this.routes = routes;
	}
	public List<RouteInfo> getRoutes( ) {
		return this.routes;
	}

}
