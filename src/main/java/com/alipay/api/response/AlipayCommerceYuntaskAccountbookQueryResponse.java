package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.accountbook.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-30 20:18:48
 */
public class AlipayCommerceYuntaskAccountbookQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7317181694764949848L;

	/** 
	 * 记账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/** 
	 * 可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 记账本的外卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

}
