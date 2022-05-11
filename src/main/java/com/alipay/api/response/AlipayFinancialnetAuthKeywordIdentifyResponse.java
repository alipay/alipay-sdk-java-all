package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.keyword.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-06 14:44:50
 */
public class AlipayFinancialnetAuthKeywordIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7688648713833977819L;

	/** 
	 * 是否该机构下的所有用户账户都属于泛金
	 */
	@ApiField("is_financial_account")
	private String isFinancialAccount;

	/** 
	 * 是否泛金机构，返回T或F
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
