package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网约车超级打车卡data
 *
 * @author auto create
 * @since 1.0, 2024-05-11 10:09:58
 */
public class OnlineRideSuperWalletData extends AlipayObject {

	private static final long serialVersionUID = 7523949762329234287L;

	/**
	 * 超级打车卡开通状态, 
已开通：opened 
未开通：notOpened
	 */
	@ApiField("super_wallet_status")
	private String superWalletStatus;

	public String getSuperWalletStatus() {
		return this.superWalletStatus;
	}
	public void setSuperWalletStatus(String superWalletStatus) {
		this.superWalletStatus = superWalletStatus;
	}

}
