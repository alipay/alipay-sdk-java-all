package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品订单状态更新接口
 *
 * @author auto create
 * @since 1.0, 2026-06-12 10:45:05
 */
public class AlipayCommerceMedicalTransactionMessageSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6569959766354471821L;

	/**
	 * 会话卡片ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 聊天ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 会话意图
	 */
	@ApiField("intent")
	private String intent;

	/**
	 * 开放平台ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 阿福主体ID
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 阿福会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * medical_order_success
	 */
	@ApiField("status")
	private String status;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getIntent() {
		return this.intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
