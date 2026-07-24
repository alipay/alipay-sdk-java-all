package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单优惠信息
 *
 * @author auto create
 * @since 1.0, 2026-07-23 10:42:21
 */
public class HealthDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 8369622164769157754L;

	/**
	 * 营销折扣
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 权益优惠类型
	 */
	@ApiField("equity_discount_type")
	private String equityDiscountType;

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getEquityDiscountType() {
		return this.equityDiscountType;
	}
	public void setEquityDiscountType(String equityDiscountType) {
		this.equityDiscountType = equityDiscountType;
	}

}
