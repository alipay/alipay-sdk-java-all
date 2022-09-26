package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询请求参数
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:53:33
 */
public class TuitionQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 8462889195859553334L;

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
