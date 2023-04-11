package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:01:46
 */
public class AlipayFundWalletConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4263333791235467165L;

	/** 
	 * 实际可以提现/销户后退的金额
	 */
	@ApiField("actual_available_amount")
	private String actualAvailableAmount;

	/** 
	 * 专项账户金额详情
	 */
	@ApiField("amount_details")
	private String amountDetails;

	/** 
	 * 可用金额
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
	 * 总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

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

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

}
