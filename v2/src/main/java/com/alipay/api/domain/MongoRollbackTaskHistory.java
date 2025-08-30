package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回档任务执行历史列表
 *
 * @author auto create
 * @since 1.0, 2024-03-13 15:55:42
 */
public class MongoRollbackTaskHistory extends AlipayObject {

	private static final long serialVersionUID = 6229848166275364664L;

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
	 * 回档任务id
	 */
	@ApiField("history_id")
	private String historyId;

	/**
	 * 回档任务状态
 - SUCCESS
 - FAILED
 - DOING
	 */
	@ApiField("status")
	private String status;

	public String getArchiveTime() {
		return this.archiveTime;
	}
	public void setArchiveTime(String archiveTime) {
		this.archiveTime = archiveTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getHistoryId() {
		return this.historyId;
	}
	public void setHistoryId(String historyId) {
		this.historyId = historyId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
