package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.broadcast.report.download response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 16:17:53
 */
public class AlipayOfflineProviderBroadcastReportDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8361645982577115934L;

	/** 
	 * 查询音响数据报表下载地址，当报表未生成时不会返回值
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 待下载报表文件大小，单位为：字节
	 */
	@ApiField("file_size")
	private Long fileSize;

	/** 
	 * 实际查询的报表日期
	 */
	@ApiField("report_dt")
	private String reportDt;

	/** 
	 * 表示该导出任务的响应状态，正常响应状态：PROCESSING、COMPLETED
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 对报表状态的解释，不返回错误信息
	 */
	@ApiField("status_message")
	private String statusMessage;

	/** 
	 * 报表任务唯一标识
	 */
	@ApiField("task_id")
	private String taskId;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	public Long getFileSize( ) {
		return this.fileSize;
	}

	public void setReportDt(String reportDt) {
		this.reportDt = reportDt;
	}
	public String getReportDt( ) {
		return this.reportDt;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getStatusMessage( ) {
		return this.statusMessage;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
