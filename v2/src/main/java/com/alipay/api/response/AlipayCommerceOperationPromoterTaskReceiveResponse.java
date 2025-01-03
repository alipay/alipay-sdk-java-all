package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaskReceiveInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.task.receive response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 11:38:29
 */
public class AlipayCommerceOperationPromoterTaskReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4158565431745528553L;

	/** 
	 * 积分领取结果
	 */
	@ApiField("task_receive_result")
	private TaskReceiveInfo taskReceiveResult;

	public void setTaskReceiveResult(TaskReceiveInfo taskReceiveResult) {
		this.taskReceiveResult = taskReceiveResult;
	}
	public TaskReceiveInfo getTaskReceiveResult( ) {
		return this.taskReceiveResult;
	}

}
