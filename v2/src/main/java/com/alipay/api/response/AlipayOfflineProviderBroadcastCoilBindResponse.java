package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.broadcast.coil.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 19:42:54
 */
public class AlipayOfflineProviderBroadcastCoilBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2128676776129827661L;

	/** 
	 * 绑定操作是否成功
	 */
	@ApiField("bind_result")
	private Boolean bindResult;

	/** 
	 * 本次绑定生效的线圈碰触达地址
	 */
	@ApiField("route_url")
	private String routeUrl;

	/** 
	 * 本次绑定的碰线圈ID
	 */
	@ApiField("tag_id")
	private String tagId;

	public void setBindResult(Boolean bindResult) {
		this.bindResult = bindResult;
	}
	public Boolean getBindResult( ) {
		return this.bindResult;
	}

	public void setRouteUrl(String routeUrl) {
		this.routeUrl = routeUrl;
	}
	public String getRouteUrl( ) {
		return this.routeUrl;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
	public String getTagId( ) {
		return this.tagId;
	}

}
