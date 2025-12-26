package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部优惠信息
 *
 * @author auto create
 * @since 1.0, 2022-12-14 15:21:50
 */
public class OutDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 6554135926113214163L;

	/**
	 * 优惠金额，单位：分
	 */
	@ApiField("discount_amount")
	private Long discountAmount;

	/**
	 * 优惠名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 优惠类型，必须是以下类型：
EXCLUSIVE_BENEFIT("专享优惠"),
EXCLUSIVE_DISCOUNT("专享折扣"),
APPRECIATION_BENEFIT("增值权益"),
MEMBER_POINT("会员积分");
	 */
	@ApiField("discount_type")
	private String discountType;

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountName() {
		return this.discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

}
