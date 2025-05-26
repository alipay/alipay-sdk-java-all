package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.bindingaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditSupplychainWfBindingaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7168185324968648688L;

	/** 
	 * 支付宝id
	 */
	@ApiField("alipayuserid")
	private String alipayuserid;

	public void setAlipayuserid(String alipayuserid) {
		this.alipayuserid = alipayuserid;
	}
	public String getAlipayuserid( ) {
		return this.alipayuserid;
	}

}
