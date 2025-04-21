package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快递员钱包账户信息
 *
 * @author auto create
 * @since 1.0, 2023-06-26 13:59:21
 */
public class WalletInfo extends AlipayObject {

	private static final long serialVersionUID = 3225325932439787582L;

	/**
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/**
	 * 钱包状态
	 */
	@ApiField("user_wallet_status")
	private String userWalletStatus;

	/**
	 * 钱包模板id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

	public String getUserWalletStatus() {
		return this.userWalletStatus;
	}
	public void setUserWalletStatus(String userWalletStatus) {
		this.userWalletStatus = userWalletStatus;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

}
