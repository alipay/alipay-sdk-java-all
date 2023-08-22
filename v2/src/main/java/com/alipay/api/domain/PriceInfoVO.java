package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格信息模型
 *
 * @author auto create
 * @since 1.0, 2023-08-04 13:53:35
 */
public class PriceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2292438797424626784L;

	/**
	 * 其他费用，单位为元
	 */
	@ApiField("additional_price")
	private String additionalPrice;

	/**
	 * 折扣费用，单位为元
	 */
	@ApiField("discounted_price")
	private String discountedPrice;

	/**
	 * 运费，单位为元
	 */
	@ApiField("freight")
	private String freight;

	/**
	 * 订单总价，单位为元
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * 实收金额，商家在交易中实际收到的款项，单位为人民币（元），支持小数点后两位
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

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

	public String getReceiptAmount() {
		return this.receiptAmount;
	}
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

}
