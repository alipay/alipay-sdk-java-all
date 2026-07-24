package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询的额外扩展信息
 *
 * @author auto create
 * @since 1.0, 2026-02-04 18:33:11
 */
public class ConsultExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 6443876363142152946L;

	/**
	 * 活动类型
	 */
	@ApiField("campaign_type")
	private String campaignType;

	/**
	 * 活动卡bin信息，可以配置多个，逗号区分
	 */
	@ApiField("card_bin")
	private String cardBin;

	/**
	 * 卡类型,多个以","分隔
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * i站银行简称
	 */
	@ApiField("inst_id")
	private String instId;

	public String getCampaignType() {
		return this.campaignType;
	}
	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

	public String getCardBin() {
		return this.cardBin;
	}
	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
