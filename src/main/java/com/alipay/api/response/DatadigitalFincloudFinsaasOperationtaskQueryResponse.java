package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.operationtask.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:49
 */
public class DatadigitalFincloudFinsaasOperationtaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1188787886117814866L;

	/** 
	 * comment + 运营任务精确查询 + 数据库
	 */
	@ApiField("comment")
	private String comment;

	/** 
	 * config + 运营任务查询 + 数据库
	 */
	@ApiField("config")
	private String config;

	/** 
	 * crowd_id + 运营任务精确查询 + 数据库
	 */
	@ApiField("crowd_id")
	private String crowdId;

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
	 * reject_comment + 运营任务精确查询 + 数据库
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
	 * update_time + 运营任务查询 + 数据库
	 */
	@ApiField("update_time")
	private Date updateTime;

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

	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment( ) {
		return this.comment;
	}

	public void setConfig(String config) {
		this.config = config;
	}
	public String getConfig( ) {
		return this.config;
	}

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

	public void setOperationTaskId(String operationTaskId) {
		this.operationTaskId = operationTaskId;
	}
	public String getOperationTaskId( ) {
		return this.operationTaskId;
	}

	public void setOperationTaskName(String operationTaskName) {
		this.operationTaskName = operationTaskName;
	}
	public String getOperationTaskName( ) {
		return this.operationTaskName;
	}

	public void setOperationTaskType(String operationTaskType) {
		this.operationTaskType = operationTaskType;
	}
	public String getOperationTaskType( ) {
		return this.operationTaskType;
	}

	public void setPlanEndTime(String planEndTime) {
		this.planEndTime = planEndTime;
	}
	public String getPlanEndTime( ) {
		return this.planEndTime;
	}

	public void setPlanStartTime(String planStartTime) {
		this.planStartTime = planStartTime;
	}
	public String getPlanStartTime( ) {
		return this.planStartTime;
	}

	public void setRejectComment(String rejectComment) {
		this.rejectComment = rejectComment;
	}
	public String getRejectComment( ) {
		return this.rejectComment;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getStatusName( ) {
		return this.statusName;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getUpdateTime( ) {
		return this.updateTime;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
