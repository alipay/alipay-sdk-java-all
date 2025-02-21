package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.odanalysis.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:21:29
 */
public class AlipayCommerceTransportIntelligentizeOdanalysisCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8116851972264137118L;

	/** 
	 * 扩展信息，json格式，由双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 服务任务ID，用于查询服务任务状态和结果
	 */
	@ApiField("service_task_id")
	private String serviceTaskId;

	/** 
	 * 服务任务类型
	 */
	@ApiField("service_task_type")
	private String serviceTaskType;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

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

}
