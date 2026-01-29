package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识发布任务结果
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:37:24
 */
public class CorpusPublishTaskResult extends AlipayObject {

	private static final long serialVersionUID = 4121967423612255451L;

	/**
	 * 知识语料类型
	 */
	@ApiField("corpus_type")
	private String corpusType;

	/**
	 * 任务创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 处理完成数量
	 */
	@ApiField("process_success_count")
	private Long processSuccessCount;

	/**
	 * 总共处理数量
	 */
	@ApiField("process_total_count")
	private Long processTotalCount;

	/**
	 * 用于说明发布任务信息，需要注明是哪种语料，上线还是下线，尽量描述的清晰准确
	 */
	@ApiField("publish_name")
	private String publishName;

	/**
	 * 知识发布类型
	 */
	@ApiField("publish_type")
	private String publishType;

	/**
	 * 任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	public String getCorpusType() {
		return this.corpusType;
	}
	public void setCorpusType(String corpusType) {
		this.corpusType = corpusType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getProcessSuccessCount() {
		return this.processSuccessCount;
	}
	public void setProcessSuccessCount(Long processSuccessCount) {
		this.processSuccessCount = processSuccessCount;
	}

	public Long getProcessTotalCount() {
		return this.processTotalCount;
	}
	public void setProcessTotalCount(Long processTotalCount) {
		this.processTotalCount = processTotalCount;
	}

	public String getPublishName() {
		return this.publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}

	public String getPublishType() {
		return this.publishType;
	}
	public void setPublishType(String publishType) {
		this.publishType = publishType;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

}
