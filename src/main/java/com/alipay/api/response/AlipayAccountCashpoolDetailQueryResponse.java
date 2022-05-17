package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-06 11:22:30
 */
public class AlipayAccountCashpoolDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4882787255497562848L;

	/** 
	 * 资金池详情，包含规则组信息、规则信息、账户关联信息
	 */
	@ApiField("cash_pool_detail")
	private String cashPoolDetail;

	public void setCashPoolDetail(String cashPoolDetail) {
		this.cashPoolDetail = cashPoolDetail;
	}
	public String getCashPoolDetail( ) {
		return this.cashPoolDetail;
	}

}
