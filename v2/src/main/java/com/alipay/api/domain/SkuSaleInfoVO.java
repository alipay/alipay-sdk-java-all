package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道商sku商品状态
 *
 * @author auto create
 * @since 1.0, 2024-07-10 11:15:50
 */
public class SkuSaleInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1884628428449479681L;

	/**
	 * sku 是否可售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 地区码
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 模糊库存，合规要求不透出精确库存，使用模糊库存描述
	 */
	@ApiField("fuzzy_quantity")
	private String fuzzyQuantity;

	/**
	 * 划线价, 即指导价，单位分
	 */
	@ApiField("mark_price")
	private Long markPrice;

	/**
	 * 售价,单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品 Id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品库存, 合规要求不透出精确值
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 渠道店铺 Id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku 管控状态
	 */
	@ApiField("sku_status")
	private String skuStatus;

	/**
	 * sku标题
	 */
	@ApiField("title")
	private String title;

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getFuzzyQuantity() {
		return this.fuzzyQuantity;
	}
	public void setFuzzyQuantity(String fuzzyQuantity) {
		this.fuzzyQuantity = fuzzyQuantity;
	}

	public Long getMarkPrice() {
		return this.markPrice;
	}
	public void setMarkPrice(Long markPrice) {
		this.markPrice = markPrice;
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

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuStatus() {
		return this.skuStatus;
	}
	public void setSkuStatus(String skuStatus) {
		this.skuStatus = skuStatus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
