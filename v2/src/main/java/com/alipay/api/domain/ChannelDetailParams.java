package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-08-15 16:00:34
 */
public class ChannelDetailParams extends AlipayObject {

	private static final long serialVersionUID = 5145314281493212382L;

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
