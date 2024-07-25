package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 18:17:05
 */
public class AlipayCloudFundWalletRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7575684476267764762L;

	/** 
	 * 原路退实际退款金额,单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/** 
	 * 原路退金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 原路退申请订单号
	 */
	@ApiField("batch_bill_no")
	private String batchBillNo;

	/** 
	 * 钱包id
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

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

}
