package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连营销任务状态同步
 *
 * @author auto create
 * @since 1.0, 2022-12-01 01:25:50
 */
public class AlipayMerchantIndirectPromotaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5658182323665437345L;

	/**
	 * 业务场景编码，接入时参考业务接入文档由支付宝侧分配。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝侧定义的商户组唯一编号，作为同一商户主体下多个smid的唯一商户编号。
	 */
	@ApiField("group_mid")
	private String groupMid;

	/**
	 * 服务商渠道2088
	 */
	@ApiField("source_pid")
	private String sourcePid;

	/**
	 * 任务英文编号
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 任务结束时间
	 */
	@ApiField("task_end_time")
	private Date taskEndTime;

	/**
	 * 任务实例ID，领取任务后有效
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务状态，枚举值：
1. FINISH，结束任务(任务已完成)
2. UN_FINISH，任务结束((任务未完成))
	 */
	@ApiField("task_state")
	private String taskState;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getGroupMid() {
		return this.groupMid;
	}
	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}

	public String getSourcePid() {
		return this.sourcePid;
	}
	public void setSourcePid(String sourcePid) {
		this.sourcePid = sourcePid;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public Date getTaskEndTime() {
		return this.taskEndTime;
	}
	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskState() {
		return this.taskState;
	}
	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

}
