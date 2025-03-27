package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WalletUseRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.rull.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-19 09:46:49
 */
public class AlipayFundWalletRullSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3826946264564723129L;

	/** 
	 * 钱包规则范围
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
