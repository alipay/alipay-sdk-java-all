package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.liveroom.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 13:51:53
 */
public class AlipayContentLiveLiveroomDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8183215313135636294L;

	/** 
	 * 直播中观看人数Uv
	 */
	@ApiField("count_uv")
	private Long countUv;

	public void setCountUv(Long countUv) {
		this.countUv = countUv;
	}
	public Long getCountUv( ) {
		return this.countUv;
	}

}
