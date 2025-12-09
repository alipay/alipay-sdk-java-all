package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下支付信息
 *
 * @author auto create
 * @since 1.0, 2025-05-20 20:33:32
 */
public class TapPayInfo extends AlipayObject {

	private static final long serialVersionUID = 5211359169546216594L;

	/**
	 * 碰一下支付的支付介质类型，标识当前支付为碰一下支付
	 */
	@ApiField("payment_medium_type")
	private String paymentMediumType;

	/**
	 * 碰一下支付的碰一下共减优惠金额
	 */
	@ApiField("total_discount_amount")
	private String totalDiscountAmount;

	/**
	 * 碰一下支付的碰一下共减金额展示名称
	 */
	@ApiField("total_discount_name")
	private String totalDiscountName;

	public String getPaymentMediumType() {
		return this.paymentMediumType;
	}
	public void setPaymentMediumType(String paymentMediumType) {
		this.paymentMediumType = paymentMediumType;
	}

	public String getTotalDiscountAmount() {
		return this.totalDiscountAmount;
	}
	public void setTotalDiscountAmount(String totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}

	public String getTotalDiscountName() {
		return this.totalDiscountName;
	}
	public void setTotalDiscountName(String totalDiscountName) {
		this.totalDiscountName = totalDiscountName;
	}

}
