package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品基础信息
 *
 * @author auto create
 * @since 1.0, 2023-09-01 15:07:27
 */
public class PromoActivityItemPageVO extends AlipayObject {

	private static final long serialVersionUID = 5319195394688873817L;

	/**
	 * 优惠ID
	 */
	@ApiField("discount_id")
	private String discountId;

	/**
	 * 是否是线上版本SPU：true为线上版本数据，false为最新版本数据
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/**
	 * 支付宝平台侧ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商家侧商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public Boolean getIsOnline() {
		return this.isOnline;
	}
	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
