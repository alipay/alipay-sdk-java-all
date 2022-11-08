package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.group.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 14:26:43
 */
public class AlipayFundEnterprisepayGroupAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5448816757487188794L;

	/** 
	 * 因公付账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 资金群组号
	 */
	@ApiField("fund_group_id")
	private String fundGroupId;

	/** 
	 * 外部群组号，业务号
	 */
	@ApiField("out_group_id")
	private String outGroupId;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setFundGroupId(String fundGroupId) {
		this.fundGroupId = fundGroupId;
	}
	public String getFundGroupId( ) {
		return this.fundGroupId;
	}

	public void setOutGroupId(String outGroupId) {
		this.outGroupId = outGroupId;
	}
	public String getOutGroupId( ) {
		return this.outGroupId;
	}

}
