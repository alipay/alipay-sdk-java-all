package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.gateway.domain.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-24 19:12:40
 */
public class AlipayCloudCloudbaseGatewayDomainCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7312732222982467772L;

	/** 
	 * 域名创建返回信息
	 */
	@ApiField("operation_info")
	private Boolean operationInfo;

	public void setOperationInfo(Boolean operationInfo) {
		this.operationInfo = operationInfo;
	}
	public Boolean getOperationInfo( ) {
		return this.operationInfo;
	}

}
