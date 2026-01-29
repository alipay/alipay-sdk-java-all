package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.wallet.autodepositstatus.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-15 14:02:39
 */
public class AlipayCommerceLogisticsWalletAutodepositstatusGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1848657861111961749L;

	/** 
	 * 钱包自动充值开通状态	
	 */
	@ApiField("auto_deposit_status")
	private String autoDepositStatus;

	/** 
	 * 用户操作时间
	 */
	@ApiField("user_operation_time")
	private String userOperationTime;

	/** 
	 * 支付宝钱包唯一ID
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/** 
	 * 钱包归属主体ID
	 */
	@ApiField("wallet_partner_id")
	private String walletPartnerId;

	public void setAutoDepositStatus(String autoDepositStatus) {
		this.autoDepositStatus = autoDepositStatus;
	}
	public String getAutoDepositStatus( ) {
		return this.autoDepositStatus;
	}

	public void setUserOperationTime(String userOperationTime) {
		this.userOperationTime = userOperationTime;
	}
	public String getUserOperationTime( ) {
		return this.userOperationTime;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

	public void setWalletPartnerId(String walletPartnerId) {
		this.walletPartnerId = walletPartnerId;
	}
	public String getWalletPartnerId( ) {
		return this.walletPartnerId;
	}

}
