package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bs.invite.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-16 14:53:44
 */
public class AlipayCommerceOperationBsInviteConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6573584384518899887L;

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
