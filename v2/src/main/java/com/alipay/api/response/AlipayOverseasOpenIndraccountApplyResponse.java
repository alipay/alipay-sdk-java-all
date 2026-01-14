package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indraccount.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-06 17:27:42
 */
public class AlipayOverseasOpenIndraccountApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4554672422313586989L;

	/** 
	 * 账号id
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 调用结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
