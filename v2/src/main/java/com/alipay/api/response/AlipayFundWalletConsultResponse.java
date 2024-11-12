package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-18 19:37:19
 */
public class AlipayFundWalletConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7469835856857162438L;

	/** 
	 * search_type=WALLET_INFO（钱包查询）时为可用金额，search_type=WITHDRAW_INFO（提现查询）时为可提现金额，search_type=DESTROY_INFO（退卡查询）时为可退款金额，单位：元
	 */
	@ApiField("actual_available_amount")
	private String actualAvailableAmount;

	/** 
	 * 专项账户金额详情
	 */
	@ApiField("amount_details")
	private String amountDetails;

	/** 
	 * 卡号：2023122000392001363140394362
	 */
	@ApiField("asset_no")
	private String assetNo;

	/** 
	 * 可用金额，单位：元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 错误code
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 历史总充值金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 钱包总余额=可用余额+冻结金额
	 */
	@ApiField("total_balance")
	private String totalBalance;

	/** 
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/** 
	 * 用户钱包开通状态
I - 申请中
E -生效
	 */
	@ApiField("user_wallet_status")
	private String userWalletStatus;

	/** 
	 * 钱包所属用户的状态
NORMAL - 正常
ABNORMAL - 异常
CLOSED - 已注销
	 */
	@ApiField("wallet_owner_status")
	private String walletOwnerStatus;

	public void setActualAvailableAmount(String actualAvailableAmount) {
		this.actualAvailableAmount = actualAvailableAmount;
	}
	public String getActualAvailableAmount( ) {
		return this.actualAvailableAmount;
	}

	public void setAmountDetails(String amountDetails) {
		this.amountDetails = amountDetails;
	}
	public String getAmountDetails( ) {
		return this.amountDetails;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	public String getAssetNo( ) {
		return this.assetNo;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalBalance(String totalBalance) {
		this.totalBalance = totalBalance;
	}
	public String getTotalBalance( ) {
		return this.totalBalance;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

	public void setUserWalletStatus(String userWalletStatus) {
		this.userWalletStatus = userWalletStatus;
	}
	public String getUserWalletStatus( ) {
		return this.userWalletStatus;
	}

	public void setWalletOwnerStatus(String walletOwnerStatus) {
		this.walletOwnerStatus = walletOwnerStatus;
	}
	public String getWalletOwnerStatus( ) {
		return this.walletOwnerStatus;
	}

}
