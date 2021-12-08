package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺优惠信息查询
 *
 * @author auto create
 * @since 1.0, 2016-10-31 11:21:25
 */
public class ShopDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 8693773662886131937L;

	/**
	 * 图片url
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 优惠信息描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 是否全场。
全场：Y，单品：N
	 */
	@ApiField("is_all")
	private String isAll;

	/**
	 * 支付宝商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 子类型
	 */
	@ApiField("promo_sub_type")
	private String promoSubType;

	/**
	 * 优惠类型。
优惠：discount
商品：item
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/**
	 * 领用模式。自动领用：AUTO_OBTAIN。手动领用：OBTAIN
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 已用数量
	 */
	@ApiField("sales_quantity")
	private String salesQuantity;

	/**
	 * 优惠信息标题
	 */
	@ApiField("subject")
	private String subject;

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsAll() {
		return this.isAll;
	}
	public void setIsAll(String isAll) {
		this.isAll = isAll;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPromoSubType() {
		return this.promoSubType;
	}
	public void setPromoSubType(String promoSubType) {
		this.promoSubType = promoSubType;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getPurchaseMode() {
		return this.purchaseMode;
	}
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

	public String getSalesQuantity() {
		return this.salesQuantity;
	}
	public void setSalesQuantity(String salesQuantity) {
		this.salesQuantity = salesQuantity;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
