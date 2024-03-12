package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaskInstanceInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.taskinstance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:31:43
 */
public class AlipayCommerceCommonTaskinstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4583279552368985984L;

	/** 
	 * 任务实例信息
	 */
	@ApiField("task_instance_info")
	private TaskInstanceInfoDTO taskInstanceInfo;

	public void setTaskInstanceInfo(TaskInstanceInfoDTO taskInstanceInfo) {
		this.taskInstanceInfo = taskInstanceInfo;
	}
	public TaskInstanceInfoDTO getTaskInstanceInfo( ) {
		return this.taskInstanceInfo;
	}

}
