package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回档任务执行明细
 *
 * @author auto create
 * @since 1.0, 2024-03-13 15:55:50
 */
public class MongoRollbackTaskDetail extends AlipayObject {

	private static final long serialVersionUID = 3713642659945224972L;

	/**
	 * 回档任务明细id
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 任务执行进度
	 */
	@ApiField("process")
	private String process;

	/**
	 * 回档后集合名称
	 */
	@ApiField("rollback_collection_name")
	private String rollbackCollectionName;

	/**
	 * 回档集合名称
	 */
	@ApiField("source_collection_name")
	private String sourceCollectionName;

	/**
	 * 回档任务明细状态
 - SUCCESS
 - FAILED
 - DOING
	 */
	@ApiField("status")
	private String status;

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getProcess() {
		return this.process;
	}
	public void setProcess(String process) {
		this.process = process;
	}

	public String getRollbackCollectionName() {
		return this.rollbackCollectionName;
	}
	public void setRollbackCollectionName(String rollbackCollectionName) {
		this.rollbackCollectionName = rollbackCollectionName;
	}

	public String getSourceCollectionName() {
		return this.sourceCollectionName;
	}
	public void setSourceCollectionName(String sourceCollectionName) {
		this.sourceCollectionName = sourceCollectionName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
