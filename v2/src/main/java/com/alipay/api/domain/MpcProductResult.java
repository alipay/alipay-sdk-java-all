package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云商品返回数据
 *
 * @author auto create
 * @since 1.0, 2024-07-01 14:05:18
 */
public class MpcProductResult extends AlipayObject {

	private static final long serialVersionUID = 4424261839468873839L;

	/**
	 * 是否可售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 商品价格(单位：分)
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品图片链接
	 */
	@ApiField("product_pic_url")
	private String productPicUrl;

	/**
	 * 商品标题
	 */
	@ApiField("product_title")
	private String productTitle;

	/**
	 * 采购方id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * SKUID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku名称
	 */
	@ApiField("sku_title")
	private String skuTitle;

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductPicUrl() {
		return this.productPicUrl;
	}
	public void setProductPicUrl(String productPicUrl) {
		this.productPicUrl = productPicUrl;
	}

	public String getProductTitle() {
		return this.productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuTitle() {
		return this.skuTitle;
	}
	public void setSkuTitle(String skuTitle) {
		this.skuTitle = skuTitle;
	}

}
