package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.gateway.domain.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-22 14:22:36
 */
public class AlipayCloudCloudbaseGatewayDomainModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6483568553633695383L;

	/** 
	 * 接口调用信息
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
