package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 每期支付信息对象
 *
 * @author auto create
 * @since 1.0, 2019-11-26 18:03:34
 */
public class MultiStagePayLineInfo extends AlipayObject {

	private static final long serialVersionUID = 7666152413321889381L;

	/**
	 * 多次支付中的1次支付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 描述分次支付中某一次支付的信息，这个字段标识”次“的数字标识，从0开始；
	 */
	@ApiField("payment_idx")
	private Long paymentIdx;

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Long getPaymentIdx() {
		return this.paymentIdx;
	}
	public void setPaymentIdx(Long paymentIdx) {
		this.paymentIdx = paymentIdx;
	}

}
