package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.product.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-20 15:16:43
 */
public class AntMerchantMemberwalletProductCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1497488343724639698L;

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

	public void setMemberWalletId(String memberWalletId) {
		this.memberWalletId = memberWalletId;
	}
	public String getMemberWalletId( ) {
		return this.memberWalletId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
