package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息子板模型，增加deliverySetting枚举，
 *
 * @author auto create
 * @since 1.0, 2024-09-18 14:14:17
 */
public class MerchantMsgTemplateVO extends AlipayObject {

	private static final long serialVersionUID = 8278533264713389662L;

	/**
	 * 消息推送类型，follower表示粉丝，all表示全部
	 */
	@ApiField("delivery_settings")
	private String deliverySettings;

	/**
	 * 消息模板疲劳度
	 */
	@ApiField("fatigue")
	private MsgFatigueVO fatigue;

	/**
	 * 消息模板关键词列表，关键词之间用逗号隔开
	 */
	@ApiField("keyword_desc")
	private String keywordDesc;

	/**
	 * 消息模板名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 订阅类型，分为一次性订阅（one_time_subscribe）和长期性订阅（long_term_subscribe）
	 */
	@ApiField("scene_rule")
	private String sceneRule;

	/**
	 * 消息模板状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 消息模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getDeliverySettings() {
		return this.deliverySettings;
	}
	public void setDeliverySettings(String deliverySettings) {
		this.deliverySettings = deliverySettings;
	}

	public MsgFatigueVO getFatigue() {
		return this.fatigue;
	}
	public void setFatigue(MsgFatigueVO fatigue) {
		this.fatigue = fatigue;
	}

	public String getKeywordDesc() {
		return this.keywordDesc;
	}
	public void setKeywordDesc(String keywordDesc) {
		this.keywordDesc = keywordDesc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSceneRule() {
		return this.sceneRule;
	}
	public void setSceneRule(String sceneRule) {
		this.sceneRule = sceneRule;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
