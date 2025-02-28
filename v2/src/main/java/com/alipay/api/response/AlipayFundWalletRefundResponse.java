package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-29 10:02:20
 */
public class AlipayFundWalletRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3114189735484668577L;

	/** 
	 * 实际退回给用户的金额。当钱包账户存在膨胀金等特殊情况时，实际退回给用户的金额等于发起金额扣减膨胀金额。单位为元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/** 
	 * 用户发起原路退的金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 原路退申请订单
	 */
	@ApiField("batch_bill_no")
	private String batchBillNo;

	/** 
	 * 场景
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
