package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.balancehis.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 10:16:49
 */
public class AlipayDataBillBalancehisQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7155828591736754366L;

	/** 
	 * 期初余额
	 */
	@ApiField("beginning_balance")
	private String beginningBalance;

	/** 
	 * 期末余额
	 */
	@ApiField("ending_balance")
	private String endingBalance;

	public void setBeginningBalance(String beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	public String getBeginningBalance( ) {
		return this.beginningBalance;
	}

	public void setEndingBalance(String endingBalance) {
		this.endingBalance = endingBalance;
	}
	public String getEndingBalance( ) {
		return this.endingBalance;
	}

}
