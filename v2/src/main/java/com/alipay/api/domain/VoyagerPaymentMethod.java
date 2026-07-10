package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付方式
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:54
 */
public class VoyagerPaymentMethod extends AlipayObject {

	private static final long serialVersionUID = 2881944342465627962L;

	/**
	 * 具体支付方式名称，字段类型与请求参数保持一致
	 */
	@ApiField("payment_method_type")
	private String paymentMethodType;

	public String getPaymentMethodType() {
		return this.paymentMethodType;
	}
	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

}
