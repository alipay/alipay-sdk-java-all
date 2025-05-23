package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 18:22:04
 */
public class AlipayCloudFundWalletWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 3741583227757845913L;

	/** 
	 * 提现单据号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

}
