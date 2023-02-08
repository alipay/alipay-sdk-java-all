package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubAccountBalanceOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.subaccount.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:47:35
 */
public class AlipayBossProdSubaccountBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3146656791539183872L;

	/** 
	 * 子户余额信息
	 */
	@ApiField("result_set")
	private SubAccountBalanceOpenApiDTO resultSet;

	public void setResultSet(SubAccountBalanceOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public SubAccountBalanceOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
