package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合支付产品支付指令关闭接口
 *
 * @author auto create
 * @since 1.0, 2022-12-26 14:46:49
 */
public class AlipayBusinessPaymenthubCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3541611572649719973L;

	/**
	 * 支付id，支付宝针对每一笔支付请求生成的唯一支付凭证
	 */
	@ApiField("payment_id")
	private String paymentId;

	public String getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

}
