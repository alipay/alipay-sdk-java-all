package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.fund.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-02 23:40:28
 */
public class AlipayFinancialnetAuthFundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7332368531198245968L;

	/** 
	 * 账户余额数值
	 */
	@ApiField("account_balance")
	private String accountBalance;

	/** 
	 * 返回余额币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 响应结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 响应结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 业务结果是否成功
	 */
	@ApiField("success")
	private String success;

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountBalance( ) {
		return this.accountBalance;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
