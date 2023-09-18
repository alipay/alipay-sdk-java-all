package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:29:04
 */
public class AlipayPcreditHuabeiMerchantActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3645239235772883633L;

	/** 
	 * 出资户账号
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 活动模版ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/** 
	 * 活动码仅在subsidy_scope为benefit_activity_code时存在值，默认为空字符串
	 */
	@ApiField("benefit_activity_code")
	private String benefitActivityCode;

	/** 
	 * 活动出资类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/** 
	 * DRAFT:草稿;START_SUCCEED:发布;PAUSE_SUCCEED:暂停;USELESS:终止
	 */
	@ApiField("status")
	private String status;

	/** 
	 * ALL代表全场贴息
ORDER代表订单贴息
benefit_activity_code代表指定活动码贴息
	 */
	@ApiField("subsidy_scope")
	private String subsidyScope;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}
	public String getAggrId( ) {
		return this.aggrId;
	}

	public void setBenefitActivityCode(String benefitActivityCode) {
		this.benefitActivityCode = benefitActivityCode;
	}
	public String getBenefitActivityCode( ) {
		return this.benefitActivityCode;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getFundType( ) {
		return this.fundType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubsidyScope(String subsidyScope) {
		this.subsidyScope = subsidyScope;
	}
	public String getSubsidyScope( ) {
		return this.subsidyScope;
	}

}
