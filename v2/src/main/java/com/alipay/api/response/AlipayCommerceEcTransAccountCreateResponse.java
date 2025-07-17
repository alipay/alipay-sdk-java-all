package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TransInCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 15:32:22
 */
public class AlipayCommerceEcTransAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8395654793935695658L;

	/** 
	 * 资金专户账号ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/** 
	 * 资金专户外表卡信息
	 */
	@ApiField("account_card_info")
	private TransInCardInfo accountCardInfo;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

	public void setAccountCardInfo(TransInCardInfo accountCardInfo) {
		this.accountCardInfo = accountCardInfo;
	}
	public TransInCardInfo getAccountCardInfo( ) {
		return this.accountCardInfo;
	}

}
