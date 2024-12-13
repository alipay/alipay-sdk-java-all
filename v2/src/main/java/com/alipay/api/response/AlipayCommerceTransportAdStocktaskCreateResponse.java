package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.stocktask.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayCommerceTransportAdStocktaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7123979942977845327L;

	/** 
	 * 库存查询任务id +  库存查询任务的唯一标识，可使用该ID进行库存任务详情查询
	 */
	@ApiField("task_id")
	private Long taskId;

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public Long getTaskId( ) {
		return this.taskId;
	}

}
