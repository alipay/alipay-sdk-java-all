package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询发奖流水
 *
 * @author auto create
 * @since 1.0, 2022-07-12 10:08:57
 */
public class AlipayMarketingCampaignTaskPrizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8375378329764571882L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 任务中心id
	 */
	@ApiField("task_cen_id")
	private String taskCenId;

	/**
	 * 出资的支付宝用户id 限制: 1、登录账号和用户ID必须且只能二选一
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTaskCenId() {
		return this.taskCenId;
	}
	public void setTaskCenId(String taskCenId) {
		this.taskCenId = taskCenId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
