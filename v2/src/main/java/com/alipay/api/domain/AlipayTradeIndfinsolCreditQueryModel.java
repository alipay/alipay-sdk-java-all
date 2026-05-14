package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 助贷双发能力选卡查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-14 16:04:18
 */
public class AlipayTradeIndfinsolCreditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3678653386345233451L;

	/**
	 * 银行卡唯一标识
	 */
	@ApiField("bank_card_token")
	private String bankCardToken;

	/**
	 * 业务场景类型
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBankCardToken() {
		return this.bankCardToken;
	}
	public void setBankCardToken(String bankCardToken) {
		this.bankCardToken = bankCardToken;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
