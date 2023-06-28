package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaskInstanceInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.taskinstance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-20 14:31:59
 */
public class AlipayCommerceCommonTaskinstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4693916776325773779L;

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
