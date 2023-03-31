package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.accountbook.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 10:06:54
 */
public class AlipayFundAccountbookCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5279766779578777274L;

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
