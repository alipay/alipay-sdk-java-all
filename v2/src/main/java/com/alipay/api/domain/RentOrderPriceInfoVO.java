package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单金额信息
 *
 * @author auto create
 * @since 1.0, 2025-07-04 21:46:18
 */
public class RentOrderPriceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1114192588113947439L;

	/**
	 * 增值服务费，单位：元，精确到小数点后两位。
	 */
	@ApiField("additional_price")
	private String additionalPrice;

	/**
	 * 到期购买金额，单位：元,精确到小数点后两位
	 */
	@ApiField("buyout_price")
	private String buyoutPrice;

	/**
	 * 押金金额，即芝麻免押评估以及预授权冻结的总金额。单位：元，精确到小数点后两位。
	 */
	@ApiField("deposit_price")
	private String depositPrice;

	/**
	 * 运费，单位：元,精确到小数点后两位
	 */
	@ApiField("freight")
	private String freight;

	/**
	 * 订单总价，单位：元,精确到小数点后两位
	 */
	@ApiField("order_price")
	private String orderPrice;

	public String getAdditionalPrice() {
		return this.additionalPrice;
	}
	public void setAdditionalPrice(String additionalPrice) {
		this.additionalPrice = additionalPrice;
	}

	public String getBuyoutPrice() {
		return this.buyoutPrice;
	}
	public void setBuyoutPrice(String buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public String getDepositPrice() {
		return this.depositPrice;
	}
	public void setDepositPrice(String depositPrice) {
		this.depositPrice = depositPrice;
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
