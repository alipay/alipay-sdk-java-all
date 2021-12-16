package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存查询任务
 *
 * @author auto create
 * @since 1.0, 2018-09-18 21:24:12
 */
public class StockTask extends AlipayObject {

	private static final long serialVersionUID = 7386766629675988636L;

	/**
	 * 用户id
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 库存查询日期
	 */
	@ApiField("query_time")
	private String queryTime;

	/**
	 * 库存任务状态：0 未开始、1 进行中、2已完成、3 失败
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 库存查询任务id
	 */
	@ApiField("task_id")
	private Long taskId;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public String getQueryTime() {
		return this.queryTime;
	}
	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
