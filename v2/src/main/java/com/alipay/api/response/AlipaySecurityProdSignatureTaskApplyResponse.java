package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignTaskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipaySecurityProdSignatureTaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6174299692475654585L;

	/** 
	 * 签约订单id，关联了若干个签约任务id。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 签约认证任务列表
	 */
	@ApiListField("task_list")
	@ApiField("sign_task_result")
	private List<SignTaskResult> taskList;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setTaskList(List<SignTaskResult> taskList) {
		this.taskList = taskList;
	}
	public List<SignTaskResult> getTaskList( ) {
		return this.taskList;
	}

}
