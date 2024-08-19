package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园支付设置
 *
 * @author auto create
 * @since 1.0, 2024-07-29 14:33:51
 */
public class PayConfig extends AlipayObject {

	private static final long serialVersionUID = 4297264896638864524L;

	/**
	 * 银行渠道模式。YES时必传，可选的字段枚举说明：{BANK:指定银行;BANK_CARD:指定银行卡}
	 */
	@ApiField("bank_channel_mode")
	private String bankChannelMode;

	/**
	 * 银行卡号，BANK_CARD时必传
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 使用银行渠道。可选的字段枚举说明：{YES:使用银行渠道;NO:使用支付宝默认扣款顺序}
注意：当指定使用银行渠道时，务必提前联系您的BD配置对应学校的银行
	 */
	@ApiField("use_bank_channel")
	private String useBankChannel;

	public String getBankChannelMode() {
		return this.bankChannelMode;
	}
	public void setBankChannelMode(String bankChannelMode) {
		this.bankChannelMode = bankChannelMode;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getUseBankChannel() {
		return this.useBankChannel;
	}
	public void setUseBankChannel(String useBankChannel) {
		this.useBankChannel = useBankChannel;
	}

}
