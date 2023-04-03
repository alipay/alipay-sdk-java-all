package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格详情信息模型
 *
 * @author auto create
 * @since 1.0, 2023-03-29 15:59:29
 */
public class PriceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2825669598165777544L;

	/**
	 * 不可折扣金额
	 */
	@ApiField("additional_price")
	private String additionalPrice;

	/**
	 * 可打折金额
	 */
	@ApiField("discounted_price")
	private String discountedPrice;

	/**
	 * 运费
	 */
	@ApiField("freight")
	private String freight;

	/**
	 * 订单金额
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
