package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-29 10:47:53
 */
public class SubscriptionSubmodeItem extends AlipayObject {

	private static final long serialVersionUID = 8374577593718968146L;

	/**
	 * 优惠券 ID；创建或 UPGRADE 场景按需传入，与 pay_amount 互斥，DOWNGRADE 不允许传入
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 订阅生效后由查询或通知接口返回的订阅项目 ID；Submode 创建场景无需传，UPGRADE/DOWNGRADE 场景条件必选
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商户提交的完整价格商品快照；CREATE、UPGRADE、DOWNGRADE 场景条件必选
	 */
	@ApiField("price_data")
	private SubscriptionPriceData priceData;

	/**
	 * Submode 数量可不传或传 1，后端统一按 1 处理；其他值会返回参数错误
	 */
	@ApiField("quantity")
	private String quantity;

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

	public SubscriptionPriceData getPriceData() {
		return this.priceData;
	}
	public void setPriceData(SubscriptionPriceData priceData) {
		this.priceData = priceData;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
