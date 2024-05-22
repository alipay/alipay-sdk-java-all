package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询任务当前状态和发奖结果
 *
 * @author auto create
 * @since 1.0, 2023-10-14 16:38:32
 */
public class AlipayMarketingCampaignTaskStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5352814547514359459L;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 任务中心id
	 */
	@ApiField("task_cen_id")
	private String taskCenId;

	/**
	 * 任务id集合
	 */
	@ApiListField("task_ids")
	@ApiField("string")
	private List<String> taskIds;

	/**
	 * 出资的支付宝用户id 限制: 1、登录账号和用户ID必须且只能二选一
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTaskCenId() {
		return this.taskCenId;
	}
	public void setTaskCenId(String taskCenId) {
		this.taskCenId = taskCenId;
	}

	public List<String> getTaskIds() {
		return this.taskIds;
	}
	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
