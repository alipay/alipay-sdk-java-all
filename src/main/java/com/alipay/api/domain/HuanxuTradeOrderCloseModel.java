package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 焕旭科技聚合支付产品支付指令关闭接口
 *
 * @author auto create
 * @since 1.0, 2021-03-17 20:20:23
 */
public class HuanxuTradeOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8591532593319745497L;

	/**
	 * 支付id，焕旭针对每一笔支付请求生成的唯一支付凭证
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
