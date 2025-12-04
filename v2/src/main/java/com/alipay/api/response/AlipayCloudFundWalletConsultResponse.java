package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 18:17:05
 */
public class AlipayCloudFundWalletConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4524146953749652277L;

	/** 
	 * 实际可以提现/销户后退的金额，单位：元
	 */
	@ApiField("actual_available_amount")
	private String actualAvailableAmount;

	/** 
	 * 卡号
	 */
	@ApiField("asset_no")
	private String assetNo;

	/** 
	 * 可用金额，单位元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 总金额，单位元
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
