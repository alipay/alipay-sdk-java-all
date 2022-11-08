package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.keyword.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-16 15:56:46
 */
public class AlipayFinancialnetAuthKeywordIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3353213595161886616L;

	/** 
	 * T代表下属的账号都是泛金融账号
F代表下属的账号不是泛金融账号
E代表下属的账号机构类型不一致有差异
N代表下属账号类型未知
	 */
	@ApiField("is_financial_account")
	private String isFinancialAccount;

	/** 
	 * T代表是泛金融机构，F代表不是泛金融机构
	 */
	@ApiField("is_financial_inst")
	private String isFinancialInst;

	public void setIsFinancialAccount(String isFinancialAccount) {
		this.isFinancialAccount = isFinancialAccount;
	}
	public String getIsFinancialAccount( ) {
		return this.isFinancialAccount;
	}

	public void setIsFinancialInst(String isFinancialInst) {
		this.isFinancialInst = isFinancialInst;
	}
	public String getIsFinancialInst( ) {
		return this.isFinancialInst;
	}

}
