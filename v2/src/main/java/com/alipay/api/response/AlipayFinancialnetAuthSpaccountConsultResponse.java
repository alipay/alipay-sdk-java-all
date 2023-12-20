package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.spaccount.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:19:53
 */
public class AlipayFinancialnetAuthSpaccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2774211672545371642L;

	/** 
	 * 若已开户，则为脱敏后已开户登录号
	 */
	@ApiField("display_opened_account_logon_id")
	private String displayOpenedAccountLogonId;

	/** 
	 * 若调用finsign服务失败，返回错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 调用finsign业务失败时，返回的错误文案
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 若返回true说明调用finsign此服务成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 返回是否已开户，若为true则说明已开户
	 */
	@ApiField("opened_account")
	private Boolean openedAccount;

	/** 
	 * 已开专户的uid
	 */
	@ApiField("opened_account_user_id")
	private String openedAccountUserId;

	/** 
	 * 已开专户的uid对应的openId
	 */
	@ApiField("opened_account_user_open_id")
	private String openedAccountUserOpenId;

	public void setDisplayOpenedAccountLogonId(String displayOpenedAccountLogonId) {
		this.displayOpenedAccountLogonId = displayOpenedAccountLogonId;
	}
	public String getDisplayOpenedAccountLogonId( ) {
		return this.displayOpenedAccountLogonId;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setOpenedAccount(Boolean openedAccount) {
		this.openedAccount = openedAccount;
	}
	public Boolean getOpenedAccount( ) {
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
