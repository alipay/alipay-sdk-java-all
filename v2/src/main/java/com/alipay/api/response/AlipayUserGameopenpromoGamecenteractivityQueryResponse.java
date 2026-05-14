package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gameopenpromo.gamecenteractivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-14 15:22:45
 */
public class AlipayUserGameopenpromoGamecenteractivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2853619847582837683L;

	/** 
	 * 平台活动对应图标地址
	 */
	@ApiField("activity_icon_url")
	private String activityIconUrl;

	/** 
	 * 平台活动对应的跳转链接
	 */
	@ApiField("activity_jump_link")
	private String activityJumpLink;

	public void setActivityIconUrl(String activityIconUrl) {
		this.activityIconUrl = activityIconUrl;
	}
	public String getActivityIconUrl( ) {
		return this.activityIconUrl;
	}

	public void setActivityJumpLink(String activityJumpLink) {
		this.activityJumpLink = activityJumpLink;
	}
	public String getActivityJumpLink( ) {
		return this.activityJumpLink;
	}

}
