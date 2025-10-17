package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.bind.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:00
 */
public class AlipayCommerceTransportEtcBindModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1689154455697638765L;

	/** 
	 * 是否更新成功；true成功/false失败
	 */
	@ApiField("update_result")
	private Boolean updateResult;

	public void setUpdateResult(Boolean updateResult) {
		this.updateResult = updateResult;
	}
	public Boolean getUpdateResult( ) {
		return this.updateResult;
	}

}
