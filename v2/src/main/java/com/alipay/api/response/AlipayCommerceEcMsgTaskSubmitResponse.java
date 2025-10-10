package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.msg.task.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-18 11:07:10
 */
public class AlipayCommerceEcMsgTaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6849763347752211131L;

	/** 
	 * 企业通知任务idl列表
	 */
	@ApiListField("task_id_list")
	@ApiField("string")
	private List<String> taskIdList;

	public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}
	public List<String> getTaskIdList( ) {
		return this.taskIdList;
	}

}
