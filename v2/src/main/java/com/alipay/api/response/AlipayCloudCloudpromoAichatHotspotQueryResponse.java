package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChatHotspot;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.hotspot.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-02 18:02:06
 */
public class AlipayCloudCloudpromoAichatHotspotQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5136622957956167813L;

	/** 
	 * 热点资讯集
	 */
	@ApiField("hotspots")
	private ChatHotspot hotspots;

	public void setHotspots(ChatHotspot hotspots) {
		this.hotspots = hotspots;
	}
	public ChatHotspot getHotspots( ) {
		return this.hotspots;
	}

}
