package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 20:00:51
 */
public class ChannelDetailParams extends AlipayObject {

	private static final long serialVersionUID = 2718961558517418731L;

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

}
