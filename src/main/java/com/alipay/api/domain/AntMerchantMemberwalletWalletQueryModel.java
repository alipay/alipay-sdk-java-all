package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询会员钱包开户信息
 *
 * @author auto create
 * @since 1.0, 2022-05-19 10:40:45
 */
public class AntMerchantMemberwalletWalletQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1648137339512384146L;

	/**
	 * 会员钱包产品ID
	 */
	@ApiField("member_wallet_id")
	private String memberWalletId;

	/**
	 * 外部用户唯一标识
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public String getMemberWalletId() {
		return this.memberWalletId;
	}
	public void setMemberWalletId(String memberWalletId) {
		this.memberWalletId = memberWalletId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
