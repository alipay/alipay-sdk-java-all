package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下支付信息
 *
 * @author auto create
 * @since 1.0, 2024-10-10 16:20:54
 */
public class TapPayInfo extends AlipayObject {

	private static final long serialVersionUID = 4745655173794827331L;

	/**
	 * 碰一下支付的支付介质类型，标识当前支付为碰一下支付
	 */
	@ApiField("payment_medium_type")
	private String paymentMediumType;

	public String getPaymentMediumType() {
		return this.paymentMediumType;
	}
	public void setPaymentMediumType(String paymentMediumType) {
		this.paymentMediumType = paymentMediumType;
	}

}
