package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 21:24:23
 */
public class ChannelDetailParams extends AlipayObject {

	private static final long serialVersionUID = 8456885577562117864L;

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
	 * 用户是否已签约
	 */
	@ApiField("user_has_sign")
	private String userHasSign;

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

	public String getUserHasSign() {
		return this.userHasSign;
	}
	public void setUserHasSign(String userHasSign) {
		this.userHasSign = userHasSign;
	}

}
