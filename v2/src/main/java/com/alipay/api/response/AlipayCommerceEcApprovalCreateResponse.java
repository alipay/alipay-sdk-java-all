package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 16:08:49
 */
public class AlipayCommerceEcApprovalCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5717212557972759987L;

	/** 
	 * 外部平台审批单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	public void setPlatformApprovalId(String platformApprovalId) {
		this.platformApprovalId = platformApprovalId;
	}
	public String getPlatformApprovalId( ) {
		return this.platformApprovalId;
	}

}
