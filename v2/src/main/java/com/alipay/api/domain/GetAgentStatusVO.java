package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI医生智能体状态信息
 *
 * @author auto create
 * @since 1.0, 2025-07-25 14:49:26
 */
public class GetAgentStatusVO extends AlipayObject {

	private static final long serialVersionUID = 3633273354831751616L;

	/**
	 * 该医生开通或者升级了ai医生：true,没有开通或者升级：false
	 */
	@ApiField("ai_assistant_opened_status")
	private Boolean aiAssistantOpenedStatus;

	/**
	 * 医生id，开启了ai医生时必填
	 */
	@ApiField("avatar_id")
	private String avatarId;

	/**
	 * 合法状态，true(通过好大夫的医生Id在灵知平台查到了医生信息)为合法，false为不合法
	 */
	@ApiField("legal_status")
	private Boolean legalStatus;

	/**
	 * ai医生跳转链接，aiAssistantOpened为true时返回跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public Boolean getAiAssistantOpenedStatus() {
		return this.aiAssistantOpenedStatus;
	}
	public void setAiAssistantOpenedStatus(Boolean aiAssistantOpenedStatus) {
		this.aiAssistantOpenedStatus = aiAssistantOpenedStatus;
	}

	public String getAvatarId() {
		return this.avatarId;
	}
	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}

	public Boolean getLegalStatus() {
		return this.legalStatus;
	}
	public void setLegalStatus(Boolean legalStatus) {
		this.legalStatus = legalStatus;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
