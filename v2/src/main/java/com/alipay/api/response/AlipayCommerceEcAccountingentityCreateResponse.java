package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.accountingentity.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 09:42:29
 */
public class AlipayCommerceEcAccountingentityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7598891996518817772L;

	/** 
	 * 核算主体id
	 */
	@ApiField("accounting_entity_id")
	private String accountingEntityId;

	public void setAccountingEntityId(String accountingEntityId) {
		this.accountingEntityId = accountingEntityId;
	}
	public String getAccountingEntityId( ) {
		return this.accountingEntityId;
	}

}
