package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验类支付信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:12
 */
public class ExaminationPayInfo extends AlipayObject {

	private static final long serialVersionUID = 5465797696733684142L;

	/**
	 * 优惠后总金额（支付金额），单位：元。币种：人民币
	 */
	@ApiField("amount_discount")
	private String amountDiscount;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	public String getAmountDiscount() {
		return this.amountDiscount;
	}
	public void setAmountDiscount(String amountDiscount) {
		this.amountDiscount = amountDiscount;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

}
