package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamecenter.coin.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 08:51:23
 */
public class AlipayUserGamecenterCoinPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8711317553429361295L;

	/** 
	 * 预扣后的用户游戏币余额
	 */
	@ApiField("balance")
	private Long balance;

	/** 
	 * 平台生成的用户游戏币扣减交易号
	 */
	@ApiField("deduct_no")
	private String deductNo;

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public Long getBalance( ) {
		return this.balance;
	}

	public void setDeductNo(String deductNo) {
		this.deductNo = deductNo;
	}
	public String getDeductNo( ) {
		return this.deductNo;
	}

}
