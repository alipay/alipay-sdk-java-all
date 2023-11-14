package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认开通钱包模版扩展参数
 *
 * @author auto create
 * @since 1.0, 2023-11-06 13:37:17
 */
public class ConsumeExtend extends AlipayObject {

	private static final long serialVersionUID = 8783798255213483811L;

	/**
	 * 是否支持圈店宝
	 */
	@ApiField("mall_assign_store")
	private Boolean mallAssignStore;

	/**
	 * 余额户钱包是否展示明细，且只在余额户钱包生效
	 */
	@ApiField("show_wallet_info_balance")
	private Boolean showWalletInfoBalance;

	public Boolean getMallAssignStore() {
		return this.mallAssignStore;
	}
	public void setMallAssignStore(Boolean mallAssignStore) {
		this.mallAssignStore = mallAssignStore;
	}

	public Boolean getShowWalletInfoBalance() {
		return this.showWalletInfoBalance;
	}
	public void setShowWalletInfoBalance(Boolean showWalletInfoBalance) {
		this.showWalletInfoBalance = showWalletInfoBalance;
	}

}
