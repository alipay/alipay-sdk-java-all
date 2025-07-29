package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.spaccount.open.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-17 11:02:34
 */
public class AlipayFinancialnetAuthSpaccountOpenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5244161711183229963L;

	/** 
	 * 开户户号
	 */
	@ApiField("opened_account")
	private String openedAccount;

	/** 
	 * 开户用户id
	 */
	@ApiField("opened_account_user_id")
	private String openedAccountUserId;

	/** 
	 * 开户用户id
	 */
	@ApiField("opened_account_user_open_id")
	private String openedAccountUserOpenId;

	public void setOpenedAccount(String openedAccount) {
		this.openedAccount = openedAccount;
	}
	public String getOpenedAccount( ) {
		return this.openedAccount;
	}

	public void setOpenedAccountUserId(String openedAccountUserId) {
		this.openedAccountUserId = openedAccountUserId;
	}
	public String getOpenedAccountUserId( ) {
		return this.openedAccountUserId;
	}

	public void setOpenedAccountUserOpenId(String openedAccountUserOpenId) {
		this.openedAccountUserOpenId = openedAccountUserOpenId;
	}
	public String getOpenedAccountUserOpenId( ) {
		return this.openedAccountUserOpenId;
	}

}
