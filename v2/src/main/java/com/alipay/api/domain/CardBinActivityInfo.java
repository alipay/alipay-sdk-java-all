package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡bin规则模型
 *
 * @author auto create
 * @since 1.0, 2021-04-15 10:41:02
 */
public class CardBinActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 3472792481565992278L;

	/**
	 * 银行标准缩写 eg： 工行ICBC，农行ABC
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 规则的卡bin
	 */
	@ApiField("card_bin")
	private String cardBin;

	/**
	 * 卡bin规则对应的外部code
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 规则对应的商家pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCardBin() {
		return this.cardBin;
	}
	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
