package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-05 16:37:42
 */
public class AlipayCommerceEcApprovalModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1656749176178349369L;

	/** 
	 * 外部平台申请单id
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
