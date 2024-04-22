package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小目标实例配置接口
 *
 * @author auto create
 * @since 1.0, 2021-12-08 10:44:23
 */
public class AlipaySocialBaseQuestInstanceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2873137666534251231L;

	/**
	 * 小目标唯一ID
	 */
	@ApiField("quest_id")
	private String questId;

	/**
	 * 每日打卡提醒时间范围，小目标提醒时间会在这个范围随机设定，时间格式HH-MM，开始时间和结束时间-分割。
传空表示取消提醒设置
	 */
	@ApiField("remind_time_range")
	private String remindTimeRange;

	/**
	 * 调用方标识
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 修改类型：
1 表示修改小目标提醒时间
	 */
	@ApiField("type")
	private Long type;

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

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
