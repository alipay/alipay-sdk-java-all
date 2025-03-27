package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板库信息
 *
 * @author auto create
 * @since 1.0, 2024-01-25 21:09:56
 */
public class MerchantMsgTemplateLibVO extends AlipayObject {

	private static final long serialVersionUID = 8772891819224787167L;

	/**
	 * 消息模板库code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 消息推送类型，follower为粉丝用户，all为所有用户
	 */
	@ApiField("delivery_settings")
	private String deliverySettings;

	/**
	 * 消息疲劳度
	 */
	@ApiField("fatigue")
	private MsgFatigueVO fatigue;

	/**
	 * 是否带push
	 */
	@ApiField("has_push")
	private Boolean hasPush;

	/**
	 * 行业编码
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 行业场景
	 */
	@ApiField("industry_scenario")
	private String industryScenario;

	/**
	 * 关键词列表，关键词之间用逗号隔开。申领消息模板时，选择需要的关键词传入
	 */
	@ApiField("keyword_desc")
	private String keywordDesc;

	/**
	 * 消息模板库名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于展示母版不可选理由以及具体说明的引导页链接，当模板可选时，本字段为空
	 */
	@ApiField("not_selectable_reason")
	private AccessFailReasonVO notSelectableReason;

	/**
	 * 描述消息模板为一次性订阅（one_time_subscribe）或长期性订阅（long_term_subscribe）
	 */
	@ApiField("scene_rule")
	private String sceneRule;

	/**
	 * 模板库是否可选，若为false，则不可申领
	 */
	@ApiField("selectable")
	private Boolean selectable;

	/**
	 * 母板状态
	 */
	@ApiField("status")
	private String status;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

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

	public Boolean getHasPush() {
		return this.hasPush;
	}
	public void setHasPush(Boolean hasPush) {
		this.hasPush = hasPush;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryScenario() {
		return this.industryScenario;
	}
	public void setIndustryScenario(String industryScenario) {
		this.industryScenario = industryScenario;
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

	public AccessFailReasonVO getNotSelectableReason() {
		return this.notSelectableReason;
	}
	public void setNotSelectableReason(AccessFailReasonVO notSelectableReason) {
		this.notSelectableReason = notSelectableReason;
	}

	public String getSceneRule() {
		return this.sceneRule;
	}
	public void setSceneRule(String sceneRule) {
		this.sceneRule = sceneRule;
	}

	public Boolean getSelectable() {
		return this.selectable;
	}
	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
