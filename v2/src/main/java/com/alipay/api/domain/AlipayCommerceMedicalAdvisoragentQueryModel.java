package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 顾问Agent流式对话
 *
 * @author auto create
 * @since 1.0, 2026-09-14 17:22:35
 */
public class AlipayCommerceMedicalAdvisoragentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7174212791575496195L;

	/**
	 * 额外字段
	 */
	@ApiField("biz_info_entity")
	private Entity bizInfoEntity;

	/**
	 * 对话ID，传递本次场景交互的唯一对话ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 外部用户ID
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/**
	 * 外部用户ID
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 会话ID，传递本次交互的唯一会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 场景技能名称
	 */
	@ApiField("skill")
	private String skill;

	public Entity getBizInfoEntity() {
		return this.bizInfoEntity;
	}
	public void setBizInfoEntity(Entity bizInfoEntity) {
		this.bizInfoEntity = bizInfoEntity;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getOutOpenId() {
		return this.outOpenId;
	}
	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSkill() {
		return this.skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

}
