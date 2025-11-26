package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网约车超级打车卡data
 *
 * @author auto create
 * @since 1.0, 2024-09-09 11:37:16
 */
public class OnlineRideSuperWalletData extends AlipayObject {

	private static final long serialVersionUID = 7225827149519778468L;

	/**
	 * 超级打车卡余额是否>0
	 */
	@ApiField("has_remaining_balance")
	private Boolean hasRemainingBalance;

	/**
	 * 超级打车卡开通状态, 
已开通：opened 
未开通：notOpened
	 */
	@ApiField("super_wallet_status")
	private String superWalletStatus;

	public Boolean getHasRemainingBalance() {
		return this.hasRemainingBalance;
	}
	public void setHasRemainingBalance(Boolean hasRemainingBalance) {
		this.hasRemainingBalance = hasRemainingBalance;
	}

	public String getSuperWalletStatus() {
		return this.superWalletStatus;
	}
	public void setSuperWalletStatus(String superWalletStatus) {
		this.superWalletStatus = superWalletStatus;
	}

}
