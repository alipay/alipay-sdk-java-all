package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:58:45
 */
public class AlipayAccountCashpoolCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7259743785898812837L;

	/** 
	 * 资金池唯一标志
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/** 
	 * 资金池名称回显
	 */
	@ApiField("cash_pool_name")
	private String cashPoolName;

	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}
	public String getCashPoolId( ) {
		return this.cashPoolId;
	}

	public void setCashPoolName(String cashPoolName) {
		this.cashPoolName = cashPoolName;
	}
	public String getCashPoolName( ) {
		return this.cashPoolName;
	}

}
