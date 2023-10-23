package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 重试数据库任务执行
 *
 * @author auto create
 * @since 1.0, 2023-08-18 14:13:00
 */
public class AlipayCloudCloudbaseDatabaseTaskRetryModel extends AlipayObject {

	private static final long serialVersionUID = 7148155754851919637L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 云数据库任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务类型
 - IMPORT
 - EXPORT
	 */
	@ApiField("task_type")
	private String taskType;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
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

}
