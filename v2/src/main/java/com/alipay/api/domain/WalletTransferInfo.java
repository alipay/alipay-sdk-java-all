package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包互转双方信息
 *
 * @author auto create
 * @since 1.0, 2025-01-07 15:00:32
 */
public class WalletTransferInfo extends AlipayObject {

	private static final long serialVersionUID = 5334886838566382323L;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
