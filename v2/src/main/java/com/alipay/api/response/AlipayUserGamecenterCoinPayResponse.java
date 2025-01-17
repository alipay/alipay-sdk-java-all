package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamecenter.coin.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 16:48:01
 */
public class AlipayUserGamecenterCoinPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8788791745415272988L;

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
