package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctoragentconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:44
 */
public class AlipayCommerceMedicalDoctoragentconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2665794639745299724L;

	/** 
	 * 原始图片地址
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 下游头像id
	 */
	@ApiField("avatar_id")
	private String avatarId;

	/** 
	 * 头像地址
	 */
	@ApiField("discovery_page_avatar")
	private String discoveryPageAvatar;

	/** 
	 * 体验地址
	 */
	@ApiField("link")
	private String link;

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

	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}
	public String getAvatarId( ) {
		return this.avatarId;
	}

	public void setDiscoveryPageAvatar(String discoveryPageAvatar) {
		this.discoveryPageAvatar = discoveryPageAvatar;
	}
	public String getDiscoveryPageAvatar( ) {
		return this.discoveryPageAvatar;
	}

	public void setLink(String link) {
		this.link = link;
	}
	public String getLink( ) {
		return this.link;
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
