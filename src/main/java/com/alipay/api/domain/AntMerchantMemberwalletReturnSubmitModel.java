package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员钱包账户退余额
 *
 * @author auto create
 * @since 1.0, 2022-08-31 15:26:11
 */
public class AntMerchantMemberwalletReturnSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8633166987757364751L;

	/**
	 * 会员钱包产品ID
	 */
	@ApiField("member_wallet_id")
	private String memberWalletId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 可退卡余额（单位：元）
	 */
	@ApiField("return_amount")
	private String returnAmount;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReturnAmount() {
		return this.returnAmount;
	}
	public void setReturnAmount(String returnAmount) {
		this.returnAmount = returnAmount;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
