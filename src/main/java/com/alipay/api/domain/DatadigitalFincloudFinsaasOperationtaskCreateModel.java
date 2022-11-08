package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营任务创建
 *
 * @author auto create
 * @since 1.0, 2022-04-27 16:41:47
 */
public class DatadigitalFincloudFinsaasOperationtaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6163173129922336313L;

	/**
	 * comment + 运营任务创建 + 前端
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * config + 运营任务创建 + 前端
	 */
	@ApiField("config")
	private String config;

	/**
	 * operation_task_name + 运营任务创建 + 前端输入。
	 */
	@ApiField("operation_task_name")
	private String operationTaskName;

	/**
	 * operation_task_type + 运营任务创建 + 前端
	 */
	@ApiField("operation_task_type")
	private String operationTaskType;

	/**
	 * plan_end_time + 运营任务创建 + 前端
	 */
	@ApiField("plan_end_time")
	private Date planEndTime;

	/**
	 * plan_start_time + 运营任务创建 + 前端
	 */
	@ApiField("plan_start_time")
	private Date planStartTime;

	/**
	 * status + 运营任务创建 + 前端
	 */
	@ApiField("status")
	private String status;

	/**
	 * tenant_code + 运营任务创建 + IAM
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	/**
	 * user_id + 运营任务创建 + IAM
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * user_name + 运营任务创建 + IAM
	 */
	@ApiField("user_name")
	private String userName;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getConfig() {
		return this.config;
	}
	public void setConfig(String config) {
		this.config = config;
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

	public Date getPlanEndTime() {
		return this.planEndTime;
	}
	public void setPlanEndTime(Date planEndTime) {
		this.planEndTime = planEndTime;
	}

	public Date getPlanStartTime() {
		return this.planStartTime;
	}
	public void setPlanStartTime(Date planStartTime) {
		this.planStartTime = planStartTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
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
