package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.income.statement.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:06:42
 */
public class AnttechBlockchainFinanceIncomeStatementSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3159378794136598779L;

	/** 
	 * 结算单同步流水号，同步成功后返回
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
