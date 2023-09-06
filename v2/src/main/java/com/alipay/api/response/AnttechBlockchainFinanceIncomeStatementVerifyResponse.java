package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.income.statement.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:56:44
 */
public class AnttechBlockchainFinanceIncomeStatementVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6656595261214841561L;

	/** 
	 * 核销流水号，核销成功后返回
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
