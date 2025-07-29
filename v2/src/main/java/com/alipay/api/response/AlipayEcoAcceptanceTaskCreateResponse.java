package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.acceptance.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:38
 */
public class AlipayEcoAcceptanceTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7529484821549814188L;

	/** 
	 * 创建的任务ID
	 */
	@ApiField("task_id")
	private Long taskId;

	/** 
	 * 结果记录条数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public Long getTaskId( ) {
		return this.taskId;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
