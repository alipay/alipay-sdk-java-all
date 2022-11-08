package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员钱包账户余额查询
 *
 * @author auto create
 * @since 1.0, 2022-05-20 15:15:15
 */
public class AntMerchantMemberwalletBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1332514215687965422L;

	/**
	 * 会员钱包产品ID
	 */
	@ApiField("member_wallet_id")
	private String memberWalletId;

	/**
	 * 会员钱包账户ID
	 */
	@ApiField("wallet_id")
	private String walletId;

	public String getMemberWalletId() {
		return this.memberWalletId;
	}
	public void setMemberWalletId(String memberWalletId) {
		this.memberWalletId = memberWalletId;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
