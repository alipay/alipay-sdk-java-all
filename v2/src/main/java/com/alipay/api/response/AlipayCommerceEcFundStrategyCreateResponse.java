package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.fund.strategy.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 11:07:35
 */
public class AlipayCommerceEcFundStrategyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5649489664942251156L;

	/** 
	 * 出资账户唯一编号
	 */
	@ApiField("fund_account_id")
	private String fundAccountId;

	/** 
	 * 出资账户类型
	 */
	@ApiField("fund_account_type")
	private String fundAccountType;

	/** 
	 * 出资方式名称，不填写时，系统会自动生成
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 出资方式唯一标识
	 */
	@ApiField("strategy_id")
	private String strategyId;

	public void setFundAccountId(String fundAccountId) {
		this.fundAccountId = fundAccountId;
	}
	public String getFundAccountId( ) {
		return this.fundAccountId;
	}

	public void setFundAccountType(String fundAccountType) {
		this.fundAccountType = fundAccountType;
	}
	public String getFundAccountType( ) {
		return this.fundAccountType;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}
	public String getStrategyId( ) {
		return this.strategyId;
	}

}
