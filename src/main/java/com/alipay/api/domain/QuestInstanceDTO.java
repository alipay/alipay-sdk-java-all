package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 目标实例数据实体
 *
 * @author auto create
 * @since 1.0, 2019-08-19 14:50:48
 */
public class QuestInstanceDTO extends AlipayObject {

	private static final long serialVersionUID = 7498283542589142259L;

	/**
	 * 跳转地址:若用户已添加目标，则返回打卡页地址，否则返回目标详情页地址
	 */
	@ApiField("action_schema")
	private String actionSchema;

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
	 * 目标实例ID，若用户没有添加目标，则实例ID为空
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 当前目标的添加人数
	 */
	@ApiField("join_count")
	private Long joinCount;

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

	public Long getJoinCount() {
		return this.joinCount;
	}
	public void setJoinCount(Long joinCount) {
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

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
