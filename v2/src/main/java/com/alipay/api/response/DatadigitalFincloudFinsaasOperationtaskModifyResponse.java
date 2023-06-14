package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.operationtask.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:32:24
 */
public class DatadigitalFincloudFinsaasOperationtaskModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6845896421266839765L;

	/** 
	 * operation_task_id + 运营任务修改 + 数据库
	 */
	@ApiField("operation_task_id")
	private String operationTaskId;

	public void setOperationTaskId(String operationTaskId) {
		this.operationTaskId = operationTaskId;
	}
	public String getOperationTaskId( ) {
		return this.operationTaskId;
	}

}
