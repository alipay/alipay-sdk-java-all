package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.accountbook.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 10:27:57
 */
public class AlipayFundAccountbookCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8863554574441776445L;

	/** 
	 * 注销的资金记账本id，注销成功时返回
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

}
