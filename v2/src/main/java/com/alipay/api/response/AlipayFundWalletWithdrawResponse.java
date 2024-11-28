package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 20:32:05
 */
public class AlipayFundWalletWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 4247995492772712595L;

	/** 
	 * 提现单据
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

}
