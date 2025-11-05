package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加固任务返回
 *
 * @author auto create
 * @since 1.0, 2023-05-25 16:28:42
 */
public class HardeningTaskResponse extends AlipayObject {

	private static final long serialVersionUID = 6568347121695357487L;

	/**
	 * 加固后的MD5
	 */
	@ApiField("after_md_five")
	private String afterMdFive;

	/**
	 * 加固后文件大小
	 */
	@ApiField("after_size")
	private Long afterSize;

	/**
	 * 加固任务状态，0为队列中，200为加固成功，负数为加固失败，0到200为加固中间状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getAfterMdFive() {
		return this.afterMdFive;
	}
	public void setAfterMdFive(String afterMdFive) {
		this.afterMdFive = afterMdFive;
	}

	public Long getAfterSize() {
		return this.afterSize;
	}
	public void setAfterSize(Long afterSize) {
		this.afterSize = afterSize;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
