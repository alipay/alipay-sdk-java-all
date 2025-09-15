package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机票订单优惠信息
 *
 * @author auto create
 * @since 1.0, 2025-08-27 11:16:26
 */
public class FlightPromotionInfo extends AlipayObject {

	private static final long serialVersionUID = 8844661315883373389L;

	/**
	 * 币种代码
	 */
	@ApiField("amount_currency")
	private String amountCurrency;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单位：分
	 */
	@ApiField("promotion_amount_cent")
	private Long promotionAmountCent;

	/**
	 * ASSETS：带资
NOT_ASSETS:不带资
	 */
	@ApiField("type")
	private String type;

	public String getAmountCurrency() {
		return this.amountCurrency;
	}
	public void setAmountCurrency(String amountCurrency) {
		this.amountCurrency = amountCurrency;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPromotionAmountCent() {
		return this.promotionAmountCent;
	}
	public void setPromotionAmountCent(Long promotionAmountCent) {
		this.promotionAmountCent = promotionAmountCent;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
