package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询营销任务列表
 *
 * @author auto create
 * @since 1.0, 2022-07-12 10:08:44
 */
public class AlipayMarketingCampaignTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1837973841693873153L;

	/**
	 * 任务中心id
	 */
	@ApiField("task_cen_id")
	private String taskCenId;

	/**
	 * 任务id
	 */
	@ApiListField("task_ids")
	@ApiField("string")
	private List<String> taskIds;

	/**
	 * 出资的支付宝用户id 限制: 1、登录账号和用户ID必须且只能二选一
	 */
	@ApiField("user_id")
	private String userId;

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
