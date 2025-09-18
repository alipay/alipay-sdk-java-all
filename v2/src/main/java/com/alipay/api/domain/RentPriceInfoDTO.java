package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁价格明细信息
 *
 * @author auto create
 * @since 1.0, 2025-04-10 15:12:29
 */
public class RentPriceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4666122261142173884L;

	/**
	 * 商家优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("discounted_price")
	private String discountedPrice;

	/**
	 * 订单总价，单位：元,精确到小数点后两位
	 */
	@ApiField("order_price")
	private String orderPrice;

	public String getDiscountedPrice() {
		return this.discountedPrice;
	}
	public void setDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

}
