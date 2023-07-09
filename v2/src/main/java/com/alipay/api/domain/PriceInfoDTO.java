package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格详情信息模型
 *
 * @author auto create
 * @since 1.0, 2023-06-15 23:05:22
 */
public class PriceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5427626477662895397L;

	/**
	 * 附加金额，单位：元
	 */
	@ApiField("additional_price")
	private String additionalPrice;

	/**
	 * 商家优惠金额，单位：元
	 */
	@ApiField("discounted_price")
	private String discountedPrice;

	/**
	 * 运费，单位：元
	 */
	@ApiField("freight")
	private String freight;

	/**
	 * 订单金额，单位：元
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
