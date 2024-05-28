package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.locallife.blacklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-17 17:25:00
 */
public class MybankCreditLoanapplyLocallifeBlacklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1737586162623489432L;

	/** 
	 * 是否是黑名单
true：是
false：否
	 */
	@ApiField("is_black")
	private Boolean isBlack;

	public void setIsBlack(Boolean isBlack) {
		this.isBlack = isBlack;
	}
	public Boolean getIsBlack( ) {
		return this.isBlack;
	}

}
