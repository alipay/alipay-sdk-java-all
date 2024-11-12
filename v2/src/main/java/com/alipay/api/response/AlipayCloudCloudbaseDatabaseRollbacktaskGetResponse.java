package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.rollbacktask.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-13 16:51:58
 */
public class AlipayCloudCloudbaseDatabaseRollbacktaskGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7789211482895786181L;

	/** 
	 * 归档时间
	 */
	@ApiField("archive_time")
	private String archiveTime;

	/** 
	 * 任务创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/** 
	 * 回档任务状态
 - SUCCESS
 - FAILED
 - DOING
	 */
	@ApiField("status")
	private String status;

	public void setArchiveTime(String archiveTime) {
		this.archiveTime = archiveTime;
	}
	public String getArchiveTime( ) {
		return this.archiveTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime( ) {
		return this.createTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
