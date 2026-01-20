package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.task.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-08 17:17:26
 */
public class AlipayCloudCloudbaseDatabaseTaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4382656823127476546L;

	/** 
	 * 导入任务url地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 导入/导出任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 导入任务id
	 */
	@ApiField("upload_id")
	private String uploadId;

	/** 
	 * 导入任务url地址
	 */
	@ApiField("upload_url")
	private String uploadUrl;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}
	public String getUploadId( ) {
		return this.uploadId;
	}

	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}
	public String getUploadUrl( ) {
		return this.uploadUrl;
	}

}
