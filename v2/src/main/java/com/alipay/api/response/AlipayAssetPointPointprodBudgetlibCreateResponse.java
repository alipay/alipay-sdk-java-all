package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class AlipayAssetPointPointprodBudgetlibCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3157551888631962773L;

	/** 
	 * 预算库余额
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * 预算库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	/** 
	 * 消息原因，当借口异常时返回异常原因，如幂等异常时，返回原业务号对应的预算库编码
	 */
	@ApiField("message")
	private String message;

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}
	public String getBudgetCode( ) {
		return this.budgetCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
