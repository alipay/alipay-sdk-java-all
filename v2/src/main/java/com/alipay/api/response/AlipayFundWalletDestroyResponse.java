package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-31 10:18:57
 */
public class AlipayFundWalletDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7547395171551512983L;

	/** 
	 * 单位元，实际退款金额
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/** 
	 * 单位元，金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 销户单号
	 */
	@ApiField("batch_bill_no")
	private String batchBillNo;

	/** 
	 * 钱包场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}
	public String getActualAmount( ) {
		return this.actualAmount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBatchBillNo(String batchBillNo) {
		this.batchBillNo = batchBillNo;
	}
	public String getBatchBillNo( ) {
		return this.batchBillNo;
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
