package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-14 18:42:22
 */
public class AlipayOfflineProviderCollaborateAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3557279167925647988L;

	/** 
	 * 授权申请单状态，如有多个授权申请单，返回其中一个申请单的状态
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
