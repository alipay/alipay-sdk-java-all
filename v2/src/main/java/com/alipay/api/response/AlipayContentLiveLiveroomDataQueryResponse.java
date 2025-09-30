package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.liveroom.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-10 19:22:33
 */
public class AlipayContentLiveLiveroomDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4115851282823695565L;

	/** 
	 * 直播中观看人数Uv
	 */
	@ApiField("count_uv")
	private Long countUv;

	/** 
	 * 实时在线人数
	 */
	@ApiField("online_uv")
	private Long onlineUv;

	/** 
	 * 点赞数
	 */
	@ApiField("praise_count")
	private Long praiseCount;

	public void setCountUv(Long countUv) {
		this.countUv = countUv;
	}
	public Long getCountUv( ) {
		return this.countUv;
	}

	public void setOnlineUv(Long onlineUv) {
		this.onlineUv = onlineUv;
	}
	public Long getOnlineUv( ) {
		return this.onlineUv;
	}

	public void setPraiseCount(Long praiseCount) {
		this.praiseCount = praiseCount;
	}
	public Long getPraiseCount( ) {
		return this.praiseCount;
	}

}
