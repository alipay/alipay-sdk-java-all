package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅查询场景下项目列表
 *
 * @author auto create
 * @since 1.0, 2026-05-12 01:07:52
 */
public class SubscriptionQueryItem extends AlipayObject {

	private static final long serialVersionUID = 7739254136325857884L;

	/**
	 * 优惠编码
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private String created;

	/**
	 * 折扣优惠金额,单位分
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 订阅id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品价格模型
	 */
	@ApiField("price")
	private NexusPayPrice price;

	/**
	 * 订阅价格项目数量，单位个
	 */
	@ApiField("quantity")
	private Long quantity;

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCreated() {
		return this.created;
	}
	public void setCreated(String created) {
		this.created = created;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public NexusPayPrice getPrice() {
		return this.price;
	}
	public void setPrice(NexusPayPrice price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
