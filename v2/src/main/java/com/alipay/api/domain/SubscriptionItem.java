package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-25 22:12:45
 */
public class SubscriptionItem extends AlipayObject {

	private static final long serialVersionUID = 2423484221755216927L;

	/**
	 * 营销创建接口（alipay.trade.promotion.coupon.create）返回的优惠id，使用方式详见具体场景接入指南
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 订阅生效后，查询接口（alipay.trade.subscription.query）或通知接口（alipay.trade.subscription.changed）返回的item_id，使用方式详见具体场景接入指南。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 价格创建接口（alipay.trade.price.create）返回的价格id，代表本次操作的目标价格信息，使用方式详见具体场景接入指南。
	 */
	@ApiField("price_id")
	private String priceId;

	/**
	 * 购买的商品数量，目前仅在席位商品的订阅创建（alipay.trade.subscription.create）场景按需传入该参数，使用方式详见具体场景接入指南。
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 目前仅用于席位商品的订阅修改（alipay.trade.subscription.modify）场景下指定当前已生效的订阅项中商品的数量，使用方式详见具体场景接入指南。
	 */
	@ApiField("source_quantity")
	private String sourceQuantity;

	/**
	 * 目前仅用于席位商品的订阅修改（alipay.trade.subscription.modify）场景下指定订阅项的目标商品数量，使用方式详见具体场景接入指南。
	 */
	@ApiField("target_quantity")
	private String targetQuantity;

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPriceId() {
		return this.priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSourceQuantity() {
		return this.sourceQuantity;
	}
	public void setSourceQuantity(String sourceQuantity) {
		this.sourceQuantity = sourceQuantity;
	}

	public String getTargetQuantity() {
		return this.targetQuantity;
	}
	public void setTargetQuantity(String targetQuantity) {
		this.targetQuantity = targetQuantity;
	}

}
