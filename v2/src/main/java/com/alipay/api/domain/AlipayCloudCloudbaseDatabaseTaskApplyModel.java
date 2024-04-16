package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 执行数据库任务命令
 *
 * @author auto create
 * @since 1.0, 2023-08-21 20:52:52
 */
public class AlipayCloudCloudbaseDatabaseTaskApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8762214789273287629L;

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
	 * 集合名称
	 */
	@ApiField("collection_name")
	private String collectionName;

	/**
	 * 数据库任务命令
 - getUploadUrl
 - import
 - export
 - getDownloadUrl
 - backup
 - restore
	 */
	@ApiField("command")
	private String command;

	/**
	 * 导入文件冲突处理方式
 - INSERT
 - UPSERT
	 */
	@ApiField("conflict_mode")
	private String conflictMode;

	/**
	 * 导出字段列表
	 */
	@ApiListField("fields")
	@ApiField("string")
	private List<String> fields;

	/**
	 * 导入或导出文件格式
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 任务序号
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 上传id
	 */
	@ApiField("upload_id")
	private String uploadId;

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

	public String getCollectionName() {
		return this.collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getCommand() {
		return this.command;
	}
	public void setCommand(String command) {
		this.command = command;
	}

	public String getConflictMode() {
		return this.conflictMode;
	}
	public void setConflictMode(String conflictMode) {
		this.conflictMode = conflictMode;
	}

	public List<String> getFields() {
		return this.fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUploadId() {
		return this.uploadId;
	}
	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}

}
