package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.odpredictionexp.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:31:56
 */
public class AlipayCommerceTransportIntelligentizeOdpredictionexpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3254655955526574987L;

	/** 
	 * 客流预测体验变化扩展信息响应
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 服务任务id，具体服务任务下唯一
	 */
	@ApiField("service_task_id")
	private String serviceTaskId;

	/** 
	 * 服务任务类型，当前服务任务类型对应于OD_PREDICTION_EXPERIENCE
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
