package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款类型
 *
 * @author auto create
 * @since 1.0, 2024-10-09 11:32:26
 */
public class PayType extends AlipayObject {

	private static final long serialVersionUID = 7547465313483874646L;

	/**
	 * 如果是微信渠道，传bank_type字段
如果是支付宝渠道，拼装字段fund_channel|bank_code|fund_type，中间用英文竖线|间隔
	 */
	@ApiField("payer_bank_type")
	private String payerBankType;

	public String getPayerBankType() {
		return this.payerBankType;
	}
	public void setPayerBankType(String payerBankType) {
		this.payerBankType = payerBankType;
	}

}
