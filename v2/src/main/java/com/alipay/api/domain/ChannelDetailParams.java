package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道扩展信息
 *
 * @author auto create
 * @since 1.0, 2026-07-13 21:09:11
 */
public class ChannelDetailParams extends AlipayObject {

	private static final long serialVersionUID = 3412358516157616376L;

	/**
	 * 预付卡分组名称
	 */
	@ApiField("card_group_name")
	private String cardGroupName;

	/**
	 * 风控咨询结果
	 */
	@ApiField("credit_risk_info")
	private String creditRiskInfo;

	/**
	 * 是否先采后付垫资版,用于先采后付前置咨询
	 */
	@ApiField("fund_loan_sign")
	private String fundLoanSign;

	/**
	 * 国家贴息
	 */
	@ApiField("gov_subsidy")
	private String govSubsidy;

	/**
	 * 银行贴息
	 */
	@ApiField("inst_subsidy")
	private String instSubsidy;

	/**
	 * 芝麻人群标签
	 */
	@ApiField("marketing_flag")
	private String marketingFlag;

	/**
	 * 芝麻拒绝原因
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 芝麻对外部商户用户是否有意愿开通芝麻免密下单的意愿分级，1为高意愿用户，0为低意向用户
	 */
	@ApiField("use_agreement_pay_willingness")
	private String useAgreementPayWillingness;

	/**
	 * 用户是否已签约
	 */
	@ApiField("user_has_sign")
	private String userHasSign;

	/**
	 * "true"：芝麻分大于等于800分
"false":  芝麻分小于800分
	 */
	@ApiField("zm_score_gte_800")
	private String zmScoreGte800;

	public String getCardGroupName() {
		return this.cardGroupName;
	}
	public void setCardGroupName(String cardGroupName) {
		this.cardGroupName = cardGroupName;
	}

	public String getCreditRiskInfo() {
		return this.creditRiskInfo;
	}
	public void setCreditRiskInfo(String creditRiskInfo) {
		this.creditRiskInfo = creditRiskInfo;
	}

	public String getFundLoanSign() {
		return this.fundLoanSign;
	}
	public void setFundLoanSign(String fundLoanSign) {
		this.fundLoanSign = fundLoanSign;
	}

	public String getGovSubsidy() {
		return this.govSubsidy;
	}
	public void setGovSubsidy(String govSubsidy) {
		this.govSubsidy = govSubsidy;
	}

	public String getInstSubsidy() {
		return this.instSubsidy;
	}
	public void setInstSubsidy(String instSubsidy) {
		this.instSubsidy = instSubsidy;
	}

	public String getMarketingFlag() {
		return this.marketingFlag;
	}
	public void setMarketingFlag(String marketingFlag) {
		this.marketingFlag = marketingFlag;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public String getUseAgreementPayWillingness() {
		return this.useAgreementPayWillingness;
	}
	public void setUseAgreementPayWillingness(String useAgreementPayWillingness) {
		this.useAgreementPayWillingness = useAgreementPayWillingness;
	}

	public String getUserHasSign() {
		return this.userHasSign;
	}
	public void setUserHasSign(String userHasSign) {
		this.userHasSign = userHasSign;
	}

	public String getZmScoreGte800() {
		return this.zmScoreGte800;
	}
	public void setZmScoreGte800(String zmScoreGte800) {
		this.zmScoreGte800 = zmScoreGte800;
	}

}
