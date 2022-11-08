package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付有礼商业化任务完结接口
 *
 * @author auto create
 * @since 1.0, 2022-09-22 20:20:53
 */
public class AlipayCommerceEducateCampusBiztaskFinishModel extends AlipayObject {

	private static final long serialVersionUID = 8688267879673812395L;

	/**
	 * 任务渠道来源
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 任务奖励金额，单位分
	 */
	@ApiField("task_bonus")
	private Long taskBonus;

	/**
	 * 任务id，唯一标识ID
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务类型：1-云码入会
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public Long getTaskBonus() {
		return this.taskBonus;
	}
	public void setTaskBonus(Long taskBonus) {
		this.taskBonus = taskBonus;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
