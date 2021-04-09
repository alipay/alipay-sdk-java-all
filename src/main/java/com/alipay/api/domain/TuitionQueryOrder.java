package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询请求参数
 *
 * @author auto create
 * @since 1.0, 2020-07-30 18:06:59
 */
public class TuitionQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 4632128922755479849L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_payment_id")
	private String alipayPaymentId;

	/**
	 * 商户订单号
	 */
	@ApiField("isv_payment_id")
	private String isvPaymentId;

	public String getAlipayPaymentId() {
		return this.alipayPaymentId;
	}
	public void setAlipayPaymentId(String alipayPaymentId) {
		this.alipayPaymentId = alipayPaymentId;
	}

	public String getIsvPaymentId() {
		return this.isvPaymentId;
	}
	public void setIsvPaymentId(String isvPaymentId) {
		this.isvPaymentId = isvPaymentId;
	}

}
