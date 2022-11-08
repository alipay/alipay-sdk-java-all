package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.bindingaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-13 17:21:43
 */
public class MybankCreditSupplychainWfBindingaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7636353114119224845L;

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
