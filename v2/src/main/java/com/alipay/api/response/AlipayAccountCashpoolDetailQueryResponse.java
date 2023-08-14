package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:02:52
 */
public class AlipayAccountCashpoolDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3428977111449611887L;

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
