package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻go商户回传的外部优惠信息
 *
 * @author auto create
 * @since 1.0, 2020-09-01 23:53:18
 */
public class ZMGoOutDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 7122976231349456744L;

	/**
	 * 商户回传的优惠金额，如用户享受的红包金额，单位元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 商户数据回传的优惠信息的名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 优惠信息的类型。为枚举值，商户可任意选择一个值作为入参传入。可取值：
("exclusiveBenefit","专享优惠"),
("exclusiveDiscount","专享折扣"),
("appreciationBenefit", "增值权益"),
("memberPoint", "会员积分")
	 */
	@ApiField("discount_type")
	private String discountType;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
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
