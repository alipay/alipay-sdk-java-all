package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营任务
 *
 * @author auto create
 * @since 1.0, 2022-04-27 11:54:33
 */
public class OperationTaskDTO extends AlipayObject {

	private static final long serialVersionUID = 3136859697565965745L;

	/**
	 * comment + 运营任务模糊查询 + 数据库
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * operation_task_id + 唯一 + 运营任务查询 + 数据库。
	 */
	@ApiField("operation_task_id")
	private String operationTaskId;

	/**
	 * operation_task_name + 运营任务查询 + 数据库。
	 */
	@ApiField("operation_task_name")
	private String operationTaskName;

	/**
	 * operation_task_type + 运营任务查询 + 数据库。
	 */
	@ApiField("operation_task_type")
	private String operationTaskType;

	/**
	 * plan_end_time + 运营任务查询 + 数据库。
	 */
	@ApiField("plan_end_time")
	private String planEndTime;

	/**
	 * plan_start_time + 运营任务查询 + 数据库。
	 */
	@ApiField("plan_start_time")
	private String planStartTime;

	/**
	 * reject_comment + 运营任务模糊查询 + 数据库
	 */
	@ApiField("reject_comment")
	private String rejectComment;

	/**
	 * status + 运营任务查询 + 数据库。
	 */
	@ApiField("status")
	private String status;

	/**
	 * statusName + 运营任务查询 + 数据库。
	 */
	@ApiField("status_name")
	private String statusName;

	/**
	 * user_id + 运营任务查询 + 数据库。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * user_name + 运营任务查询 + 数据库。
	 */
	@ApiField("user_name")
	private String userName;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOperationTaskId() {
		return this.operationTaskId;
	}
	public void setOperationTaskId(String operationTaskId) {
		this.operationTaskId = operationTaskId;
	}

	public String getOperationTaskName() {
		return this.operationTaskName;
	}
	public void setOperationTaskName(String operationTaskName) {
		this.operationTaskName = operationTaskName;
	}

	public String getOperationTaskType() {
		return this.operationTaskType;
	}
	public void setOperationTaskType(String operationTaskType) {
		this.operationTaskType = operationTaskType;
	}

	public String getPlanEndTime() {
		return this.planEndTime;
	}
	public void setPlanEndTime(String planEndTime) {
		this.planEndTime = planEndTime;
	}

	public String getPlanStartTime() {
		return this.planStartTime;
	}
	public void setPlanStartTime(String planStartTime) {
		this.planStartTime = planStartTime;
	}

	public String getRejectComment() {
		return this.rejectComment;
	}
	public void setRejectComment(String rejectComment) {
		this.rejectComment = rejectComment;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusName() {
		return this.statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
