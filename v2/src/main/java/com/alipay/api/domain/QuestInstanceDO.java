package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小目标实例模型
 *
 * @author auto create
 * @since 1.0, 2020-02-24 11:36:25
 */
public class QuestInstanceDO extends AlipayObject {

	private static final long serialVersionUID = 5483817199453573199L;

	/**
	 * 跳转地址:若用户已添加目标，则返回打卡页，否则返回目标详情页地址
	 */
	@ApiField("action_schema")
	private String actionSchema;

	/**
	 * 用户当前获取卡片详情
	 */
	@ApiField("card_instance")
	private CardInstanceDO cardInstance;

	/**
	 * 卡片绑定的权益信息
	 */
	@ApiListField("card_promos")
	@ApiField("card_promo_d_o")
	private List<CardPromoDO> cardPromos;

	/**
	 * 用户已打卡天数
	 */
	@ApiField("day_count")
	private Long dayCount;

	/**
	 * 小目标图标icon
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 目标实例ID，若用户没有添加目标，则实例为空
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 当前目标的添加人数
	 */
	@ApiField("join_count")
	private String joinCount;

	/**
	 * 当前用户是否添加目标
	 */
	@ApiField("joined")
	private Boolean joined;

	/**
	 * 是否已打卡
	 */
	@ApiField("marked")
	private Boolean marked;

	/**
	 * 目标唯一ID
	 */
	@ApiField("quest_id")
	private String questId;

	/**
	 * 用户设定目标的提醒时间
	 */
	@ApiListField("remind_times")
	@ApiField("string")
	private List<String> remindTimes;

	/**
	 * 小目标标题
	 */
	@ApiField("title")
	private String title;

	public String getActionSchema() {
		return this.actionSchema;
	}
	public void setActionSchema(String actionSchema) {
		this.actionSchema = actionSchema;
	}

	public CardInstanceDO getCardInstance() {
		return this.cardInstance;
	}
	public void setCardInstance(CardInstanceDO cardInstance) {
		this.cardInstance = cardInstance;
	}

	public List<CardPromoDO> getCardPromos() {
		return this.cardPromos;
	}
	public void setCardPromos(List<CardPromoDO> cardPromos) {
		this.cardPromos = cardPromos;
	}

	public Long getDayCount() {
		return this.dayCount;
	}
	public void setDayCount(Long dayCount) {
		this.dayCount = dayCount;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getJoinCount() {
		return this.joinCount;
	}
	public void setJoinCount(String joinCount) {
		this.joinCount = joinCount;
	}

	public Boolean getJoined() {
		return this.joined;
	}
	public void setJoined(Boolean joined) {
		this.joined = joined;
	}

	public Boolean getMarked() {
		return this.marked;
	}
	public void setMarked(Boolean marked) {
		this.marked = marked;
	}

	public String getQuestId() {
		return this.questId;
	}
	public void setQuestId(String questId) {
		this.questId = questId;
	}

	public List<String> getRemindTimes() {
		return this.remindTimes;
	}
	public void setRemindTimes(List<String> remindTimes) {
		this.remindTimes = remindTimes;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
