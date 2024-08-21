package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车费缴费折扣信息
 *
 * @author auto create
 * @since 1.0, 2024-08-12 17:31:53
 */
public class ParkingPaymentDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 2542541839924346511L;

	/**
	 * 折扣金额；单位元；
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 折扣类型；
COMPREHENSIVE：综合；
DISCOUNT：打折；
VOUCHER：券；
POINTS：积分；
	 */
	@ApiField("discount_type")
	private String discountType;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

}
