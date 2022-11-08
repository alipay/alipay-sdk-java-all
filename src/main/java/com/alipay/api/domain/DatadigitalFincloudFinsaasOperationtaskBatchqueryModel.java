package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营任务模糊查询
 *
 * @author auto create
 * @since 1.0, 2022-09-26 10:19:48
 */
public class DatadigitalFincloudFinsaasOperationtaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2198416993364416879L;

	/**
	 * execution_time + 运营活动查询 + 前端
	 */
	@ApiField("execution_time")
	private String executionTime;

	/**
	 * operation_task_name + 运营任务查询 + 前端。
	 */
	@ApiField("operation_task_name")
	private String operationTaskName;

	/**
	 * operation_task_type + 运营任务查询
	 */
	@ApiField("operation_task_type")
	private String operationTaskType;

	/**
	 * page_num + 运营任务查询 + 前端
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * page_size + 运营任务查询 + 前端
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * status + 运营任务查询 + 前端。
	 */
	@ApiField("status")
	private String status;

	/**
	 * tenant_code + 唯一 + 接口必传 + 从 IAM 获取
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	/**
	 * user_ids + 运营任务模糊查询 + IAM
	 */
	@ApiField("user_ids")
	private String userIds;

	/**
	 * user_name + 运营任务查询 + IAM。
	 */
	@ApiField("user_name")
	private String userName;

	public String getExecutionTime() {
		return this.executionTime;
	}
	public void setExecutionTime(String executionTime) {
		this.executionTime = executionTime;
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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
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

	public String getUserIds() {
		return this.userIds;
	}
	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
