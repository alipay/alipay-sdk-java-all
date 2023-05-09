package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.odprediction.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:31:48
 */
public class AlipayCommerceTransportIntelligentizeOdpredictionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8273314546782322259L;

	/** 
	 * 找不到当前任务对应线路站点数据
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 服务任务id，在具体任务类型下唯一
	 */
	@ApiField("service_task_id")
	private String serviceTaskId;

	/** 
	 * 服务任务类型，当前任务对应于OD_PREDICTION
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
