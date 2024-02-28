package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceSubTaskCreateOpenapiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.flowodanalys.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-29 13:31:44
 */
public class AlipayCommerceTransportIntelligentizeFlowodanalysCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8718779466531857397L;

	/** 
	 * 服务任务ID
	 */
	@ApiField("service_task_id")
	private String serviceTaskId;

	/** 
	 * 服务任务类型
	 */
	@ApiField("service_task_type")
	private String serviceTaskType;

	/** 
	 * 服务子任务创建结果列表
	 */
	@ApiListField("sub_task_create_result_list")
	@ApiField("service_sub_task_create_openapi_result")
	private List<ServiceSubTaskCreateOpenapiResult> subTaskCreateResultList;

	public void setServiceTaskId(String serviceTaskId) {
		this.serviceTaskId = serviceTaskId;
	}
	public String getServiceTaskId( ) {
		return this.serviceTaskId;
	}

	public void setServiceTaskType(String serviceTaskType) {
		this.serviceTaskType = serviceTaskType;
	}
	public String getServiceTaskType( ) {
		return this.serviceTaskType;
	}

	public void setSubTaskCreateResultList(List<ServiceSubTaskCreateOpenapiResult> subTaskCreateResultList) {
		this.subTaskCreateResultList = subTaskCreateResultList;
	}
	public List<ServiceSubTaskCreateOpenapiResult> getSubTaskCreateResultList( ) {
		return this.subTaskCreateResultList;
	}

}
