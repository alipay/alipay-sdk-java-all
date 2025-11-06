package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康档案数据同步
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class AlipayCommerceMedicalHealthArchiveSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7861925693419732617L;

	/**
	 * 以Map形式返回具体内容
	 */
	@ApiField("content_data")
	private ContentData contentData;

	/**
	 * 数据来源机构编码
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 同步状态
	 */
	@ApiField("sync_status")
	private String syncStatus;

	/**
	 * 同步方式-同步类型 total：全量同步 additional：增量同步 daily：T+1同步
	 */
	@ApiField("sync_type")
	private String syncType;

	/**
	 * 任务id，字段来源扁鹊授权接口
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public ContentData getContentData() {
		return this.contentData;
	}
	public void setContentData(ContentData contentData) {
		this.contentData = contentData;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSyncStatus() {
		return this.syncStatus;
	}
	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
