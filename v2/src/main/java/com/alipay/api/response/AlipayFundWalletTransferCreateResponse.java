package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.transfer.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-07 15:02:25
 */
public class AlipayFundWalletTransferCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3835285221953868883L;

	/** 
	 * 互转单据id
	 */
	@ApiField("bill_no")
	private String billNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

}
