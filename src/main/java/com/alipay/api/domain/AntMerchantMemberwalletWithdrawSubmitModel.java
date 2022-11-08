package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员钱包账户提现
 *
 * @author auto create
 * @since 1.0, 2022-05-20 16:07:46
 */
public class AntMerchantMemberwalletWithdrawSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4548634156354389626L;

	/**
	 * 会员钱包产品ID
	 */
	@ApiField("member_wallet_id")
	private String memberWalletId;

	/**
	 * 外部业务唯一流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 会员钱包账户ID
	 */
	@ApiField("wallet_id")
	private String walletId;

	/**
	 * 提现金额（单位：元）
	 */
	@ApiField("withdraw_amount")
	private String withdrawAmount;

	public String getMemberWalletId() {
		return this.memberWalletId;
	}
	public void setMemberWalletId(String memberWalletId) {
		this.memberWalletId = memberWalletId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

	public String getWithdrawAmount() {
		return this.withdrawAmount;
	}
	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

}
