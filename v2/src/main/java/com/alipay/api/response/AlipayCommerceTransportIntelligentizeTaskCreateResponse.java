package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:02
 */
public class AlipayCommerceTransportIntelligentizeTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1413681895218652923L;

	/** 
	 * 传递扩展参数，双方约定
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 支付宝服务任务ID，保证全局唯一
	 */
	@ApiField("service_task_id")
	private String serviceTaskId;

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

}
