package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctoravatarinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:44
 */
public class AlipayCommerceMedicalDoctoravatarinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4221838791864755281L;

	/** 
	 * 原始图片地址
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 头像地址
	 */
	@ApiField("discovery_page_avatar")
	private String discoveryPageAvatar;

	/** 
	 * 状态 
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 欢迎页头像地址
	 */
	@ApiField("welcome_card_avatar")
	private String welcomeCardAvatar;

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setDiscoveryPageAvatar(String discoveryPageAvatar) {
		this.discoveryPageAvatar = discoveryPageAvatar;
	}
	public String getDiscoveryPageAvatar( ) {
		return this.discoveryPageAvatar;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setWelcomeCardAvatar(String welcomeCardAvatar) {
		this.welcomeCardAvatar = welcomeCardAvatar;
	}
	public String getWelcomeCardAvatar( ) {
		return this.welcomeCardAvatar;
	}

}
