package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bs.invite.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:56:50
 */
public class AlipayCommerceOperationBsInviteConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5591439428829662638L;

	/** 
	 * 是否被邀约
	 */
	@ApiField("invitable")
	private Boolean invitable;

	public void setInvitable(Boolean invitable) {
		this.invitable = invitable;
	}
	public Boolean getInvitable( ) {
		return this.invitable;
	}

}
