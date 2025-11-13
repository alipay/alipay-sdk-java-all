package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WalletUseRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 12:12:31
 */
public class AlipayFundWalletRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1657535161436122971L;

	/** 
	 * 钱包使用规则
	 */
	@ApiField("wallet_use_rule")
	private WalletUseRule walletUseRule;

	public void setWalletUseRule(WalletUseRule walletUseRule) {
		this.walletUseRule = walletUseRule;
	}
	public WalletUseRule getWalletUseRule( ) {
		return this.walletUseRule;
	}

}
