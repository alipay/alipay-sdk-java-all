package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单的价格信息
 *
 * @author auto create
 * @since 1.0, 2024-06-25 21:28:13
 */
public class RentPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 3646953496645469869L;

	/**
	 * 附加金额，单位：元，精确到小数点后两位
	 */
	@ApiField("additional_price")
	private String additionalPrice;

	/**
	 * 优惠金额，单位：元，精确到小数点后两位
	 */
	@ApiField("discounted_price")
	private String discountedPrice;

	/**
	 * 运费，单位：元，精确到小数点后两位
	 */
	@ApiField("freight")
	private String freight;

	/**
	 * 订单金额，单位：元，精确到小数点后两位
	 */
	@ApiField("order_price")
	private String orderPrice;

	public String getAdditionalPrice() {
		return this.additionalPrice;
	}
	public void setAdditionalPrice(String additionalPrice) {
		this.additionalPrice = additionalPrice;
	}

	public String getDiscountedPrice() {
		return this.discountedPrice;
	}
	public void setDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getFreight() {
		return this.freight;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

}
