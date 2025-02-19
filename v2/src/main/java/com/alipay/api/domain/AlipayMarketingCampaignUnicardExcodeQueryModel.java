package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换码状态查询
 *
 * @author auto create
 * @since 1.0, 2022-12-07 10:53:34
 */
public class AlipayMarketingCampaignUnicardExcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5457588973626665427L;

	/**
	 * 支付宝内部生成的兑换码，商家可用该兑换码作为商品出售，用户用兑换码可来支付宝兑换权益。
	 */
	@ApiField("exchange_code")
	private String exchangeCode;

	public String getExchangeCode() {
		return this.exchangeCode;
	}
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

}
