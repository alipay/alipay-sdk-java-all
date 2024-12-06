package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户添加小目标
 *
 * @author auto create
 * @since 1.0, 2021-12-08 10:44:14
 */
public class AlipaySocialBaseQuestInstanceAddModel extends AlipayObject {

	private static final long serialVersionUID = 3585112477445594855L;

	/**
	 * 目标ID
	 */
	@ApiField("quest_id")
	private String questId;

	/**
	 * 每日打卡提醒时间范围，小目标提醒时间会在这个范围随机设定，时间格式HH-MM，开始时间和结束时间-分割。
	 */
	@ApiField("remind_time_range")
	private String remindTimeRange;

	/**
	 * 调用方标识
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getQuestId() {
		return this.questId;
	}
	public void setQuestId(String questId) {
		this.questId = questId;
	}

	public String getRemindTimeRange() {
		return this.remindTimeRange;
	}
	public void setRemindTimeRange(String remindTimeRange) {
		this.remindTimeRange = remindTimeRange;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
